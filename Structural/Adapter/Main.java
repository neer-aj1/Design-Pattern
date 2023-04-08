public class Main {
    public static void main(String[] args) {
        ApiUser apiUser = new ApiUser();
        apiUser.usage("google", "ads");
        apiUser.usage("facebook", "socialMedia");
        apiUser.usage("restapi", "selfMadeApi");
        apiUser.usage("twitter", "tweetApi");
    }
}