package fm.castbox.mediation.model;

/* loaded from: classes3.dex */
public class NetworkName {
    public static final String FACEBOOK_AUDIENCE_NETWORK = "FACEBOOK_AUDIENCE_NETWORK";
    public static final String GOOGLE_ADMOB = "GOOGLE_ADMOB";
    public static final String UNKNOWN = "UNKNOWN";

    public static boolean validate(String str) {
        str.hashCode();
        return str.equals(FACEBOOK_AUDIENCE_NETWORK) || str.equals(GOOGLE_ADMOB);
    }
}
