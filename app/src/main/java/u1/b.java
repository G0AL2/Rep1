package u1;

import android.content.ActivityNotFoundException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: FacebookPagesManagerShare.java */
/* loaded from: classes.dex */
public class b extends n {
    public b(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // u1.m
    protected String c() {
        return "https://www.facebook.com/sharer/sharer.php?u={url}";
    }

    @Override // u1.m
    protected String i() {
        return "com.facebook.pages.app";
    }

    @Override // u1.m
    protected String j() {
        return null;
    }

    @Override // u1.n, u1.m
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        super.m(readableMap);
        n();
    }
}
