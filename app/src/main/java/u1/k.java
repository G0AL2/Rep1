package u1;

import android.content.ActivityNotFoundException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: PinterestShare.java */
/* loaded from: classes.dex */
public class k extends n {
    public k(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // u1.m
    protected String c() {
        return "https://pinterest.com/pin/create/button/?url={url}&media=$media&description={message}";
    }

    @Override // u1.m
    protected String i() {
        return "com.pinterest";
    }

    @Override // u1.m
    protected String j() {
        return "market://details?id=com.pinterest";
    }

    @Override // u1.n, u1.m
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        super.m(readableMap);
        n();
    }
}
