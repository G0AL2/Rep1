package cl.json;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import u1.c;
import u1.d;
import u1.e;
import u1.f;
import u1.g;
import u1.h;
import u1.i;
import u1.j;
import u1.k;
import u1.l;
import u1.m;
import u1.o;
import u1.p;
import u1.q;
import u1.r;
import u1.s;
import u1.t;

/* loaded from: classes.dex */
public class RNShareModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final int SHARE_REQUEST_CODE = 16845;
    private final ReactApplicationContext reactContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5525a;

        static {
            int[] iArr = new int[b.values().length];
            f5525a = iArr;
            try {
                iArr[b.generic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5525a[b.facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5525a[b.facebookstories.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5525a[b.pagesmanager.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5525a[b.twitter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5525a[b.whatsapp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5525a[b.whatsappbusiness.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5525a[b.instagram.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5525a[b.instagramstories.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5525a[b.googleplus.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5525a[b.email.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5525a[b.pinterest.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5525a[b.sms.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5525a[b.snapchat.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5525a[b.messenger.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5525a[b.linkedin.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5525a[b.telegram.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* loaded from: classes.dex */
    private enum b {
        facebook,
        facebookstories,
        generic,
        pagesmanager,
        twitter,
        whatsapp,
        whatsappbusiness,
        instagram,
        instagramstories,
        googleplus,
        email,
        pinterest,
        messenger,
        snapchat,
        sms,
        linkedin,
        telegram;

        public static m g(String str, ReactApplicationContext reactApplicationContext) {
            switch (a.f5525a[valueOf(str).ordinal()]) {
                case 1:
                    return new e(reactApplicationContext);
                case 2:
                    return new c(reactApplicationContext);
                case 3:
                    return new d(reactApplicationContext);
                case 4:
                    return new u1.b(reactApplicationContext);
                case 5:
                    return new r(reactApplicationContext);
                case 6:
                    return new t(reactApplicationContext);
                case 7:
                    return new s(reactApplicationContext);
                case 8:
                    return new g(reactApplicationContext);
                case 9:
                    return new h(reactApplicationContext);
                case 10:
                    return new f(reactApplicationContext);
                case 11:
                    return new u1.a(reactApplicationContext);
                case 12:
                    return new k(reactApplicationContext);
                case 13:
                    return new l(reactApplicationContext);
                case 14:
                    return new o(reactApplicationContext);
                case 15:
                    return new j(reactApplicationContext);
                case 16:
                    return new i(reactApplicationContext);
                case 17:
                    return new q(reactApplicationContext);
                default:
                    return null;
            }
        }
    }

    public RNShareModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        b[] values;
        HashMap hashMap = new HashMap();
        for (b bVar : b.values()) {
            hashMap.put(bVar.toString().toUpperCase(Locale.ROOT), bVar.toString());
        }
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNShare";
    }

    @ReactMethod
    public void isBase64File(String str, Callback callback, Callback callback2) {
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme == null || !scheme.equals("data")) {
                callback2.invoke(Boolean.FALSE);
            } else {
                callback2.invoke(Boolean.TRUE);
            }
        } catch (Exception e10) {
            PrintStream printStream = System.out;
            printStream.println("ERROR " + e10.getMessage());
            e10.printStackTrace(System.out);
            callback.invoke(e10.getMessage());
        }
    }

    @ReactMethod
    public void isPackageInstalled(String str, Callback callback, Callback callback2) {
        try {
            callback2.invoke(Boolean.valueOf(m.l(str, this.reactContext)));
        } catch (Exception e10) {
            PrintStream printStream = System.out;
            printStream.println("Error: " + e10.getMessage());
            callback.invoke(e10.getMessage());
        }
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 16845) {
            if (i11 == 0) {
                p.d(true, Boolean.FALSE, "CANCELED");
            } else if (i11 == -1) {
                p.d(true, Boolean.TRUE);
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Callback callback, Callback callback2) {
        p.c(callback2, callback);
        try {
            new e(this.reactContext).m(readableMap);
        } catch (ActivityNotFoundException e10) {
            PrintStream printStream = System.out;
            printStream.println("ERROR " + e10.getMessage());
            e10.printStackTrace(System.out);
            p.d(false, "not_available");
        } catch (Exception e11) {
            PrintStream printStream2 = System.out;
            printStream2.println("ERROR " + e11.getMessage());
            e11.printStackTrace(System.out);
            p.d(false, e11.getMessage());
        }
    }

    @ReactMethod
    public void shareSingle(ReadableMap readableMap, Callback callback, Callback callback2) {
        System.out.println("SHARE SINGLE METHOD");
        p.c(callback2, callback);
        if (m.k("social", readableMap)) {
            try {
                m g10 = b.g(readableMap.getString("social"), this.reactContext);
                if (g10 != null) {
                    g10.m(readableMap);
                    return;
                }
                throw new ActivityNotFoundException("Invalid share activity");
            } catch (ActivityNotFoundException e10) {
                PrintStream printStream = System.out;
                printStream.println("ERROR " + e10.getMessage());
                e10.printStackTrace(System.out);
                p.d(false, e10.getMessage());
                return;
            } catch (Exception e11) {
                PrintStream printStream2 = System.out;
                printStream2.println("ERROR " + e11.getMessage());
                e11.printStackTrace(System.out);
                p.d(false, e11.getMessage());
                return;
            }
        }
        p.d(false, "key 'social' missing in options");
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        onActivityResult(i10, i11, intent);
    }
}
