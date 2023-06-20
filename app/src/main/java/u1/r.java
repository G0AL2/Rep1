package u1;

import android.content.ActivityNotFoundException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: TwitterShare.java */
/* loaded from: classes.dex */
public class r extends n {
    public r(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public String c() {
        return "https://twitter.com/intent/tweet?text={message}&url={url}";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public String i() {
        return "com.twitter.android";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public String j() {
        return null;
    }

    @Override // u1.n, u1.m
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        super.m(readableMap);
        n();
    }
}
