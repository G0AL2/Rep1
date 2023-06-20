package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.fbreact.specs.NativeIntentAndroidSpec;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

@o6.a(name = IntentModule.NAME)
/* loaded from: classes.dex */
public class IntentModule extends NativeIntentAndroidSpec {
    public static final String NAME = "IntentAndroid";

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15565a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f15565a = iArr;
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15565a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15565a[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public IntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void sendOSIntent(Intent intent, Boolean bool) {
        Activity currentActivity = getCurrentActivity();
        String packageName = getReactApplicationContext().getPackageName();
        ComponentName resolveActivity = intent.resolveActivity(getReactApplicationContext().getPackageManager());
        String packageName2 = resolveActivity != null ? resolveActivity.getPackageName() : "";
        if (bool.booleanValue() || currentActivity == null || !packageName.equals(packageName2)) {
            intent.addFlags(268435456);
        }
        if (currentActivity != null) {
            currentActivity.startActivity(intent);
        } else {
            getReactApplicationContext().startActivity(intent);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void canOpenURL(String str, Promise promise) {
        if (str != null && !str.isEmpty()) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                promise.resolve(Boolean.valueOf(intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null));
                return;
            } catch (Exception e10) {
                promise.reject(new JSApplicationIllegalArgumentException("Could not check if URL '" + str + "' can be opened: " + e10.getMessage()));
                return;
            }
        }
        promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + str));
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void getInitialURL(Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            String str = null;
            if (currentActivity != null) {
                Intent intent = currentActivity.getIntent();
                String action = intent.getAction();
                Uri data = intent.getData();
                if (data != null && ("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) {
                    str = data.toString();
                }
            }
            promise.resolve(str);
        } catch (Exception e10) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not get the initial URL : " + e10.getMessage()));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openSettings(Promise promise) {
        try {
            Intent intent = new Intent();
            Activity currentActivity = getCurrentActivity();
            String packageName = getReactApplicationContext().getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + packageName));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            currentActivity.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not open the Settings: " + e10.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openURL(String str, Promise promise) {
        if (str != null && !str.isEmpty()) {
            try {
                sendOSIntent(new Intent("android.intent.action.VIEW", Uri.parse(str).normalizeScheme()), Boolean.FALSE);
                promise.resolve(Boolean.TRUE);
                return;
            } catch (Exception e10) {
                promise.reject(new JSApplicationIllegalArgumentException("Could not open URL '" + str + "': " + e10.getMessage()));
                return;
            }
        }
        promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + str));
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void sendIntent(String str, ReadableArray readableArray, Promise promise) {
        if (str != null && !str.isEmpty()) {
            Intent intent = new Intent(str);
            if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) == null) {
                promise.reject(new JSApplicationIllegalArgumentException("Could not launch Intent with action " + str + "."));
                return;
            }
            if (readableArray != null) {
                for (int i10 = 0; i10 < readableArray.size(); i10++) {
                    ReadableMap map = readableArray.getMap(i10);
                    String nextKey = map.keySetIterator().nextKey();
                    int i11 = a.f15565a[map.getType(nextKey).ordinal()];
                    if (i11 == 1) {
                        intent.putExtra(nextKey, map.getString(nextKey));
                    } else if (i11 == 2) {
                        intent.putExtra(nextKey, Double.valueOf(map.getDouble(nextKey)));
                    } else if (i11 != 3) {
                        promise.reject(new JSApplicationIllegalArgumentException("Extra type for " + nextKey + " not supported."));
                        return;
                    } else {
                        intent.putExtra(nextKey, map.getBoolean(nextKey));
                    }
                }
            }
            sendOSIntent(intent, Boolean.TRUE);
            return;
        }
        promise.reject(new JSApplicationIllegalArgumentException("Invalid Action: " + str + "."));
    }
}
