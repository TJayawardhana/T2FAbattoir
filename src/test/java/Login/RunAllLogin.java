package Login;

public class RunAllLogin {
    public static void main(String[] args) throws InterruptedException {
        tc_AbbatoirLoginWithEmptyCredentials.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithEmptyPasswordWithValidEmail.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithEmptyPasswordWithInvalidEmail.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithEmptyEmailWithValidPassword.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithEmptyEmailWithInvalidPassword.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithWrongPasswordFormatValidEmail.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithWrongPasswordFormatInvalidEmail.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithWrongFormatEmailPasword.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithWrongEmailFormatValidPassword.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithWrongEmailFormatInvalidPassword.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithValidCredentials.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithInvalidPasswordValidEmail.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithInvalidEmailValidPassword.main(args);
        Thread.sleep(7000);
        tc_AbbatoirLoginWithInvalidCredentials.main(args);
    }
}
