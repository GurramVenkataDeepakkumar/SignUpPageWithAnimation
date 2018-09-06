using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace SignInPageWithAnimationSample
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class SignInPageView 
    {
        public SignInPageView()
        {
            try
            {
                InitializeComponent();
            }
            catch(Exception ex)
            {
            }
        }

        protected async override void OnAppearing()
        {
            base.OnAppearing();

            await Task.WhenAll(layoutconfpass.TranslateTo(0, mainGrid.Height, 200, Easing.Linear), Social.TranslateTo(0, layoutconfpass.Height - 15, 200, Easing.Linear));
        }

        private async void mainsignin_Tapped(object sender, EventArgs e)
        {
            mainsignin.FontAttributes = FontAttributes.Bold;
            mainsignup.FontAttributes = FontAttributes.None;

            await Task.WhenAll(mainbox.TranslateTo(0, 0, 120, Easing.SinOut), layoutconfpass.TranslateTo(0, mainGrid.Height, 500, Easing.SinOut), Social.TranslateTo(0, layoutconfpass.Height - 15, 500, Easing.SinOut), Social.FadeTo(1, 500));

            this.Title = btn.Text = "Sign In";
        }

        private async void mainsignup_Tapped(object sender, EventArgs e)
        {
            mainsignup.FontAttributes = FontAttributes.Bold;
            mainsignin.FontAttributes = FontAttributes.None;

            await Task.WhenAll(mainbox.TranslateTo(mainbox.Width, 0, 120, Easing.SinOut), layoutconfpass.TranslateTo(0, 0, 500, Easing.SinOut), Social.TranslateTo(0, 0, 500, Easing.SinOut), Social.FadeTo(0, 100));

            this.Title = btn.Text = "Sign Up";
        }
    }
}