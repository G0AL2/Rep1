package u1;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: WhatsAppShare.java */
/* loaded from: classes.dex */
public class t extends n {
    public t(ReactApplicationContext reactApplicationContext) {
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
        return "com.whatsapp";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public String j() {
        return "market://details?id=com.whatsapp";
    }

    @Override // u1.n, u1.m
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        super.m(readableMap);
        if (readableMap.hasKey("whatsAppNumber")) {
            try {
                g().setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
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
