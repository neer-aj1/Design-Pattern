public class GoogleApi implements ThirdPatryApi{
    @Override
    public void googleApi(String apiName) {
        System.out.println("Using google api"+ apiName );
    }

    @Override
    public void facebookApi(String apiName) {
        System.out.println("Error");
    }
}
