package u1;

import android.content.ActivityNotFoundException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: MessengerShare.java */
/* loaded from: classes.dex */
public class j extends n {
    public j(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // u1.m
    protected String c() {
        return null;
    }

    @Override // u1.m
    protected String i() {
        return "com.facebook.orca";
    }

    @Override // u1.m
    protected String j() {
        return "market://details?id=com.facebook.orca";
    }

    @Override // u1.n, u1.m
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        super.m(readableMap);
        n();
    }
}
