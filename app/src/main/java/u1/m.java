package u1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import cl.json.RNShareModule;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* compiled from: ShareIntent.java */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    protected final ReactApplicationContext f37337a;

    /* renamed from: b  reason: collision with root package name */
    protected Intent f37338b;

    /* renamed from: c  reason: collision with root package name */
    protected String f37339c = "Share";

    /* renamed from: d  reason: collision with root package name */
    protected t1.d f37340d;

    /* renamed from: e  reason: collision with root package name */
    protected ReadableMap f37341e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShareIntent.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<HashMap<String, String>> {
        a(m mVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
            return hashMap.get("simpleName").compareTo(hashMap2.get("simpleName"));
        }
    }

    public m(ReactApplicationContext reactApplicationContext) {
        this.f37337a = reactApplicationContext;
        o(new Intent("android.intent.action.SEND"));
        g().setType("text/plain");
    }

    private ComponentName[] d(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(g().getAction());
        intent.setType(g().getType());
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = this.f37337a.getPackageManager().queryIntentActivities(intent, 0);
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(string)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
            }
        }
        return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
    }

    public static boolean k(String str, ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    public static boolean l(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String p(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("URLEncoder.encode() failed for " + str);
        }
    }

    public Intent a(Intent intent, ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        ArrayList<HashMap> arrayList2 = new ArrayList();
        Intent intent2 = new Intent(intent.getAction());
        intent2.setType(intent.getType());
        List<ResolveInfo> queryIntentActivities = this.f37337a.getPackageManager().queryIntentActivities(intent2, 0);
        if (!queryIntentActivities.isEmpty()) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo != null && !readableMap.getArray("excludedActivityTypes").toString().contains(resolveInfo.activityInfo.packageName)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("packageName", resolveInfo.activityInfo.packageName);
                    hashMap.put("className", resolveInfo.activityInfo.name);
                    hashMap.put("simpleName", String.valueOf(resolveInfo.activityInfo.loadLabel(this.f37337a.getPackageManager())));
                    arrayList2.add(hashMap);
                }
            }
            if (!arrayList2.isEmpty()) {
                Collections.sort(arrayList2, new a(this));
                for (HashMap hashMap2 : arrayList2) {
                    Intent intent3 = (Intent) intent.clone();
                    intent3.setPackage((String) hashMap2.get("packageName"));
                    intent3.setClassName((String) hashMap2.get("packageName"), (String) hashMap2.get("className"));
                    arrayList.add(intent3);
                }
                Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), AppLovinEventTypes.USER_SHARED_LINK);
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                return createChooser;
            }
        }
        return Intent.createChooser(intent, "Share");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String c();

    protected t1.d e(ReadableMap readableMap) {
        String string = k("filename", readableMap) ? readableMap.getString("filename") : null;
        Boolean bool = Boolean.FALSE;
        if (k("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool2 = bool;
        if (k("type", readableMap)) {
            return new t1.d(readableMap.getString(ImagesContract.URL), readableMap.getString("type"), string, bool2, this.f37337a);
        }
        return new t1.d(readableMap.getString(ImagesContract.URL), string, bool2, this.f37337a);
    }

    protected t1.e f(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        if (k("filenames", readableMap)) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getString(i10));
            }
        }
        Boolean bool = Boolean.FALSE;
        if (k("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool2 = bool;
        if (k("type", readableMap)) {
            return new t1.e(readableMap.getArray("urls"), arrayList, readableMap.getString("type"), bool2, this.f37337a);
        }
        return new t1.e(readableMap.getArray("urls"), arrayList, bool2, this.f37337a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Intent g() {
        return this.f37338b;
    }

    protected Intent[] h(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities = this.f37337a.getPackageManager().queryIntentActivities(intent, 0);
        Intent[] intentArr = new Intent[queryIntentActivities.size()];
        for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i10);
            String str = resolveInfo.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
            intent2.setAction("android.intent.action.VIEW");
            intent2.setDataAndType(uri, intent.getType());
            intent2.addFlags(1);
            intentArr[i10] = new Intent(intent2);
        }
        return intentArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String i();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String j();

    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        this.f37341e = readableMap;
        if (k("subject", readableMap)) {
            g().putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (k(Scopes.EMAIL, readableMap)) {
            g().putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString(Scopes.EMAIL)});
        }
        if (k("title", readableMap)) {
            this.f37339c = readableMap.getString("title");
        }
        String string = k("message", readableMap) ? readableMap.getString("message") : "";
        String string2 = k("social", readableMap) ? readableMap.getString("social") : "";
        if (string2.equals("sms")) {
            String string3 = readableMap.getString("recipient");
            if (!string3.isEmpty()) {
                g().putExtra("address", string3);
            }
        }
        if (string2.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            String string4 = readableMap.getString("whatsAppNumber");
            g().putExtra("jid", string4 + "@s.whatsapp.net");
        }
        if (string2.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            String string5 = readableMap.getString("whatsAppNumber");
            g().putExtra("jid", string5 + "@s.whatsapp.net");
        }
        if (k("urls", readableMap)) {
            t1.e f10 = f(readableMap);
            if (f10.f()) {
                ArrayList<Uri> d10 = f10.d();
                g().setAction("android.intent.action.SEND_MULTIPLE");
                g().setType(f10.c());
                g().putParcelableArrayListExtra("android.intent.extra.STREAM", d10);
                g().addFlags(1);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                g().putExtra("android.intent.extra.TEXT", string);
            } else if (!TextUtils.isEmpty(string)) {
                Intent g10 = g();
                g10.putExtra("android.intent.extra.TEXT", string + " " + readableMap.getArray("urls").getString(0));
            } else {
                g().putExtra("android.intent.extra.TEXT", readableMap.getArray("urls").getString(0));
            }
        } else if (k(ImagesContract.URL, readableMap)) {
            t1.d e10 = e(readableMap);
            this.f37340d = e10;
            if (e10.f()) {
                Uri d11 = this.f37340d.d();
                g().setType(this.f37340d.c());
                g().putExtra("android.intent.extra.STREAM", d11);
                g().addFlags(1);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                g().putExtra("android.intent.extra.TEXT", string);
            } else if (!TextUtils.isEmpty(string)) {
                Intent g11 = g();
                g11.putExtra("android.intent.extra.TEXT", string + " " + readableMap.getString(ImagesContract.URL));
            } else {
                g().putExtra("android.intent.extra.TEXT", readableMap.getString(ImagesContract.URL));
            }
        } else if (TextUtils.isEmpty(string)) {
        } else {
            g().putExtra("android.intent.extra.TEXT", string);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n() throws ActivityNotFoundException {
        Intent createChooser;
        Activity currentActivity = this.f37337a.getCurrentActivity();
        if (currentActivity == null) {
            p.d(false, "Something went wrong");
            return;
        }
        IntentSender intentSender = null;
        if (p.b()) {
            intentSender = p.a(this.f37337a);
            createChooser = Intent.createChooser(g(), this.f37339c, intentSender);
        } else {
            createChooser = Intent.createChooser(g(), this.f37339c);
        }
        createChooser.addFlags(1073741824);
        if (k("showAppsToView", this.f37341e) && k(ImagesContract.URL, this.f37341e)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType(this.f37340d.c());
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", h(intent, this.f37340d.d()));
        }
        if (k("excludedActivityTypes", this.f37341e)) {
            if (Build.VERSION.SDK_INT >= 24) {
                createChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", d(this.f37341e.getArray("excludedActivityTypes")));
                currentActivity.startActivityForResult(createChooser, RNShareModule.SHARE_REQUEST_CODE);
            } else {
                currentActivity.startActivityForResult(a(g(), this.f37341e), RNShareModule.SHARE_REQUEST_CODE);
            }
        } else {
            currentActivity.startActivityForResult(createChooser, RNShareModule.SHARE_REQUEST_CODE);
        }
        if (intentSender == null) {
            p.d(true, Boolean.TRUE, "OK");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(Intent intent) {
        this.f37338b = intent;
    }
}
