package f7;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ResourceDrawableIdHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f30102b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f30103a = new HashMap();

    private c() {
    }

    public static c b() {
        if (f30102b == null) {
            synchronized (c.class) {
                if (f30102b == null) {
                    f30102b = new c();
                }
            }
        }
        return f30102b;
    }

    public synchronized void a() {
        this.f30103a.clear();
    }

    public Drawable c(Context context, String str) {
        int d10 = d(context, str);
        if (d10 > 0) {
            return context.getResources().getDrawable(d10);
        }
        return null;
    }

    public int d(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace(Constants.FILENAME_SEQUENCE_SEPARATOR, "_");
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.f30103a.containsKey(replace)) {
                    return this.f30103a.get(replace).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.f30103a.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }

    public Uri e(Context context, String str) {
        int d10 = d(context, str);
        if (d10 > 0) {
            return new Uri.Builder().scheme("res").path(String.valueOf(d10)).build();
        }
        return Uri.EMPTY;
    }
}
