package m2;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.amazon.device.ads.BuildConfig;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: APSEvent.java */
/* loaded from: classes.dex */
public class a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    String f34182a;

    /* renamed from: b  reason: collision with root package name */
    String f34183b;

    /* renamed from: c  reason: collision with root package name */
    long f34184c;

    /* renamed from: d  reason: collision with root package name */
    b f34185d;

    /* renamed from: e  reason: collision with root package name */
    String f34186e;

    /* renamed from: f  reason: collision with root package name */
    String f34187f;

    /* renamed from: g  reason: collision with root package name */
    int f34188g;

    /* renamed from: h  reason: collision with root package name */
    String f34189h;

    /* renamed from: i  reason: collision with root package name */
    String f34190i;

    /* renamed from: j  reason: collision with root package name */
    String f34191j = "";

    /* renamed from: k  reason: collision with root package name */
    String f34192k = "";

    /* renamed from: l  reason: collision with root package name */
    String f34193l = "";

    public a(Context context, b bVar, String str) {
        this.f34186e = "";
        this.f34187f = "";
        this.f34189h = "";
        this.f34190i = "";
        try {
            this.f34182a = BuildConfig.VERSION_NAME;
            this.f34187f = "Android";
            this.f34188g = Build.VERSION.SDK_INT;
            this.f34189h = Build.MANUFACTURER;
            this.f34190i = Build.MODEL;
            this.f34184c = System.currentTimeMillis();
            this.f34186e = context == null ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : context.getPackageName();
            d(bVar);
            e(str);
        } catch (RuntimeException e10) {
            Log.e("APSEvent", "Error constructing the APSEvent:", e10);
        }
    }

    public a a() {
        return this;
    }

    public b b() {
        return this.f34185d;
    }

    public a c(String str) {
        if (str != null) {
            int length = str.length();
            if (length > 2048) {
                length = 2048;
            }
            this.f34192k = str.substring(0, length);
        }
        return this;
    }

    public a d(b bVar) {
        this.f34185d = bVar;
        return this;
    }

    public a e(String str) {
        this.f34183b = str;
        return this;
    }

    public a f(Exception exc) {
        if (exc != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                if (stringWriter2.length() > 2048) {
                    int length = ((2048 - exc.getMessage().length()) - 6) / 2;
                    String substring = stringWriter2.substring(0, length);
                    String substring2 = stringWriter2.substring(stringWriter2.length() - length);
                    this.f34193l = exc.getMessage() + "..." + substring + "..." + substring2;
                } else {
                    this.f34193l = exc.getMessage() + "\n" + stringWriter2;
                }
            } catch (RuntimeException e10) {
                Log.e("APSEvent", "Error in parsing the exception detail; ", e10);
            }
        }
        return this;
    }

    public String g() {
        String str = "";
        String format = String.format("msg = %s;", this.f34192k);
        String a10 = l2.a.a();
        if (!n2.c.a(a10)) {
            format = format.concat(a10);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", this.f34182a);
            jSONObject.put("eventType", this.f34183b);
            jSONObject.put("eventTimestamp", this.f34184c);
            jSONObject.put("severity", this.f34185d.name());
            jSONObject.put("appId", this.f34186e);
            jSONObject.put("osName", this.f34187f);
            jSONObject.put("osVersion", this.f34188g);
            jSONObject.put("deviceManufacturer", this.f34189h);
            jSONObject.put("deviceModel", this.f34190i);
            jSONObject.put("configVersion", this.f34191j);
            jSONObject.put("otherDetails", format);
            jSONObject.put("exceptionDetails", this.f34193l);
            str = Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace("\n", "");
        } catch (RuntimeException | JSONException e10) {
            Log.e("APSEvent", "Error in parsing the json .. ignoring : ", e10);
        }
        return "{\"Data\": \"" + str + "\",\"PartitionKey\": \"" + this.f34184c + "\"}";
    }
}
