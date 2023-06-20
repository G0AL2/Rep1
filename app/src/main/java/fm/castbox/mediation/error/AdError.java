package fm.castbox.mediation.error;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";
    private AdError cause;
    private int code;
    private String domain;
    private String message;

    /* loaded from: classes3.dex */
    public static final class Code {
        public static final int AD_EMPTY_PAYLOAD = 18;
        public static final int AD_EVENTUAL_FAILURE = 20;
        public static final int AD_FAILED_TO_FETCH = 16;
        public static final int AD_FAILED_TO_LOAD = 17;
        public static final int AD_FAILED_TO_SHOW = 19;
        public static final int DISPLAY_NOTIFICATION_FAILED = 32;
        public static final int SDK_INITIALIZATION_DONE = 0;
        public static final int SDK_INITIALIZATION_FAILURE = 1;
    }

    public AdError(int i10, String str, String str2) {
        this(i10, str, str2, null);
    }

    public AdError getCause() {
        return this.cause;
    }

    public int getCode() {
        return this.code;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getMessage() {
        return this.message;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.code);
        jSONObject.put("Message", this.message);
        jSONObject.put("Domain", this.domain);
        AdError adError = this.cause;
        if (adError == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", adError.toJSON());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return toJSON().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public AdError(int i10, String str, String str2, AdError adError) {
        this.code = i10;
        this.message = str;
        this.domain = str2;
        this.cause = adError;
    }
}
