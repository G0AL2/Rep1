package u1;

import android.content.ActivityNotFoundException;
import android.os.Build;
import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: SMSShare.java */
/* loaded from: classes.dex */
public class l extends n {

    /* renamed from: f  reason: collision with root package name */
    private ReactApplicationContext f37336f;

    public l(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f37336f = null;
        this.f37336f = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public String c() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public String i() {
        return Build.VERSION.SDK_INT >= 19 ? Telephony.Sms.getDefaultSmsPackage(this.f37336f) : "com.android.mms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public String j() {
        return "market://details?id=com.android.mms";
    }

    @Override // u1.n, u1.m
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        super.m(readableMap);
        n();
    }
}
