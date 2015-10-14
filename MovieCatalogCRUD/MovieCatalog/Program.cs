using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Data.Entity;
using System.Linq;
using System.Data.Entity.ModelConfiguration.Conventions;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations.Schema;

namespace MovieCatalog
{
    class Program
    {
        static void Main(string[] args)
        {
            using (var db = new MovieCatalogContext())
            {
                Console.WriteLine("Enter a full name for an actor: ");

                var fullname = Console.ReadLine();

                var actor = new Actor { FullName = fullname };
                db.Actors.Add(actor);
                db.SaveChanges();

                var queryOfActor = from d in db.Actors
                                   orderby d.FullName
                                   select d;

                Console.WriteLine("Show all full names in database: ");

                foreach (var item in queryOfActor)
                {
                    Console.WriteLine(item.FullName);
                }

                Console.WriteLine("Press any key to exit...");
                Console.ReadKey();
            }
        }
    }

    public class Director
    {
        public int DirectorID { get; set; }
        public string FullName { get; set; }

        public virtual ICollection<Movie> Movies { get; set; }
    }

    public class Movie
    {
        [DatabaseGenerated(DatabaseGeneratedOption.None)]
        public int MovieID { get; set; }
        public int CreditsID { get; set; }
        public int DirectorID { get; set; }

        public string Plot { get; set; }
        public string Title { get; set; }
        public DateTime Year { get; set; }

        public virtual Director Director { get; set; }
        public virtual ICollection<Credits> Credits { get; set; }
    }

    public class Credits
    {
        [Key]
        public int CreditsID { get; set; }
        public int MovieID { get; set; }
        public int ActorID { get; set; }

        public virtual Actor Actor { get; set; }
        public virtual Movie Movie { get; set; }
    }

    public class Actor
    {
        public int ActorID { get; set; }
        public int CreditsID { get; set; }
        public string FullName { get; set; }

        public virtual ICollection<Credits> Credits { get; set; }
    }

    public class MovieCatalogContext : DbContext
    {
        public DbSet<Actor> Actors { get; set; }
        public DbSet<Director> Directors { get; set; }
        public DbSet<Credits> Credits { get; set; }
        public DbSet<Movie> Movies { get; set; }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Conventions.Remove<PluralizingTableNameConvention>();
        }
    }
}
