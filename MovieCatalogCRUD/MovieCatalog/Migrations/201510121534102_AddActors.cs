namespace MovieCatalog.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class AddActors : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Actor",
                c => new
                    {
                        ActorID = c.Int(nullable: false, identity: true),
                        CreditsID = c.Int(nullable: false),
                        FullName = c.String(),
                    })
                .PrimaryKey(t => t.ActorID);
            
            CreateTable(
                "dbo.Credits",
                c => new
                    {
                        CreditsID = c.Int(nullable: false, identity: true),
                        MovieID = c.Int(nullable: false),
                        ActorID = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.CreditsID)
                .ForeignKey("dbo.Actor", t => t.ActorID, cascadeDelete: true)
                .ForeignKey("dbo.Movie", t => t.MovieID, cascadeDelete: true)
                .Index(t => t.MovieID)
                .Index(t => t.ActorID);
            
            CreateTable(
                "dbo.Movie",
                c => new
                    {
                        MovieID = c.Int(nullable: false, identity: true),
                        CreditsID = c.Int(nullable: false),
                        DirectorID = c.Int(nullable: false),
                        Title = c.String(),
                        Year = c.DateTime(nullable: false),
                    })
                .PrimaryKey(t => t.MovieID)
                .ForeignKey("dbo.Director", t => t.DirectorID, cascadeDelete: true)
                .Index(t => t.DirectorID);
            
            CreateTable(
                "dbo.Director",
                c => new
                    {
                        DirectorID = c.Int(nullable: false, identity: true),
                        FullName = c.String(),
                    })
                .PrimaryKey(t => t.DirectorID);
            
        }
        
        public override void Down()
        {
            DropForeignKey("dbo.Movie", "DirectorID", "dbo.Director");
            DropForeignKey("dbo.Credits", "MovieID", "dbo.Movie");
            DropForeignKey("dbo.Credits", "ActorID", "dbo.Actor");
            DropIndex("dbo.Movie", new[] { "DirectorID" });
            DropIndex("dbo.Credits", new[] { "ActorID" });
            DropIndex("dbo.Credits", new[] { "MovieID" });
            DropTable("dbo.Director");
            DropTable("dbo.Movie");
            DropTable("dbo.Credits");
            DropTable("dbo.Actor");
        }
    }
}
