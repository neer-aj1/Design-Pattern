public class ApiUser implements RestAPI{
    ApiAdapter apiAdapter;

    @Override
    public void usage(String apiType, String apiName) {
        if(apiType.equalsIgnoreCase("restAPI"))
            System.out.println("Using google api: " + apiName);
        else if (apiType.equalsIgnoreCase("facebook") || apiType.equalsIgnoreCase("google")){
            apiAdapter = new ApiAdapter(apiType);
            apiAdapter.usage(apiType, apiName);
        }
        else
            System.out.println("Not valid api");
    }
}
