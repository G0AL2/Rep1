package u1;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: WhatsAppBusinessShare.java */
/* loaded from: classes.dex */
public class s extends n {
    public s(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public String c() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public String i() {
        return "com.whatsapp.w4b";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public String j() {
        return "market://details?id=com.whatsapp.w4b";
    }

    @Override // u1.n, u1.m
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        super.m(readableMap);
        if (readableMap.hasKey("whatsAppNumber")) {
            try {
                g().setComponent(new ComponentName("com.whatsapp.w4b", "com.whatsapp.Conversation"));
                n();
                Thread.sleep(10L);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        g().setComponent(null);
        n();
    }
}
