using System;
using System.Data;
using System.Configuration;
using System.Collections;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;

public partial class Login : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void buttonLogin_click(object sender, EventArgs e)
    {
        Session["userID"] = textboxLogin.Text;
        Response.Redirect("Home.aspx");
    }
    protected void buttonCancel_click(object sender, EventArgs e)
    {
        textboxLogin.Text = "";
        textboxPassword.Text = "";
    }
}
