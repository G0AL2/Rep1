package u1;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.common.internal.ImagesContract;

/* compiled from: InstagramShare.java */
/* loaded from: classes.dex */
public class g extends n {
    public g(ReactApplicationContext reactApplicationContext) {
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
        return "com.instagram.android";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public String j() {
        return "https://play.google.com/store/apps/details?id=com.instagram.android";
    }

    @Override // u1.n, u1.m
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        super.m(readableMap);
        if (!m.k(ImagesContract.URL, readableMap)) {
            Log.e("RNShare", "No url provided");
            return;
        }
        String string = readableMap.getString(ImagesContract.URL);
        if (Boolean.valueOf(string.startsWith("instagram://")).booleanValue()) {
            s(string);
        } else if (!m.k("type", readableMap)) {
            Log.e("RNShare", "No type provided");
        } else if (Boolean.valueOf(readableMap.getString("type").startsWith("image")).booleanValue()) {
            r(string, this.f37339c);
        } else {
            super.n();
        }
    }

    protected void r(String str, String str2) {
        Uri d10 = new t1.d(str, "image/jpeg", "image", Boolean.valueOf(m.k("useInternalStorage", this.f37341e) && this.f37341e.getBoolean("useInternalStorage")), this.f37337a).d();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", d10);
        intent.setPackage("com.instagram.android");
        Intent intent2 = new Intent("com.instagram.share.ADD_TO_STORY");
        intent2.setDataAndType(d10, "jpg");
        intent2.addFlags(1);
        intent2.setPackage("com.instagram.android");
        Intent createChooser = Intent.createChooser(intent, str2);
        createChooser.addFlags(268435456);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
        this.f37337a.getCurrentActivity().grantUriPermission("com.instagram.android", d10, 1);
        this.f37337a.startActivity(createChooser);
    }

    protected void s(String str) {
        Uri parse = Uri.parse(str);
        g().setAction("android.intent.action.VIEW");
        g().setData(parse);
        super.n();
    }
}
