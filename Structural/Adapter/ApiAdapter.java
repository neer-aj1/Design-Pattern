public class ApiAdapter implements RestAPI{
    ThirdPatryApi thirdPatryApi;

    public ApiAdapter(String apiType) {
        if(apiType.equalsIgnoreCase("google"))
            thirdPatryApi = new GoogleApi();
        else if(apiType.equalsIgnoreCase("facebook"))
            thirdPatryApi = new FacebookApi();
    }

    @Override
    public void usage(String apiType, String apiName) {
        if(apiType.equalsIgnoreCase("google"))
            thirdPatryApi.googleApi(apiName);
        else if (apiType.equalsIgnoreCase("facebook"))
            thirdPatryApi.facebookApi(apiName);
    }
}
