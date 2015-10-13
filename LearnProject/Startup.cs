using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(LearnProject.Startup))]
namespace LearnProject
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
