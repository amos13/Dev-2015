using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(MovieCatalogCRUD.Startup))]
namespace MovieCatalogCRUD
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
