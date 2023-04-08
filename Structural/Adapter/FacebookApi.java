public class FacebookApi implements ThirdPatryApi{
    @Override
    public void googleApi(String apiName) {
        System.out.println("Error");
    }

    @Override
    public void facebookApi(String apiName) {
        System.out.println("Using facebook api: " + apiName);
    }
}
