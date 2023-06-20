package u1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appstate.AppStateModule;

/* compiled from: InstagramStoriesShare.java */
/* loaded from: classes.dex */
public class h extends n {
    public h(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        o(new Intent("com.instagram.share.ADD_TO_STORY"));
    }

    private void r(ReadableMap readableMap) {
        String string;
        if (!m.k("backgroundImage", readableMap) && !m.k("backgroundVideo", readableMap) && !m.k("stickerImage", readableMap)) {
            throw new IllegalArgumentException("Invalid background or sticker assets provided.");
        }
        Activity currentActivity = this.f37337a.getCurrentActivity();
        boolean z10 = false;
        if (currentActivity == null) {
            p.d(false, "Something went wrong");
            return;
        }
        this.f37338b.putExtra("bottom_background_color", "#906df4");
        this.f37338b.putExtra("top_background_color", "#837DF4");
        if (m.k("attributionURL", readableMap)) {
            this.f37338b.putExtra("content_url", readableMap.getString("attributionURL"));
        }
        if (m.k("backgroundTopColor", readableMap)) {
            this.f37338b.putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
        }
        if (m.k("backgroundBottomColor", readableMap)) {
            this.f37338b.putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
        }
        Boolean bool = Boolean.FALSE;
        if (m.k("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean valueOf = Boolean.valueOf((m.k("backgroundImage", readableMap) || m.k("backgroundVideo", readableMap)) ? true : true);
        if (valueOf.booleanValue()) {
            if (m.k("backgroundImage", readableMap)) {
                string = readableMap.getString("backgroundImage");
            } else {
                string = m.k("backgroundVideo", readableMap) ? readableMap.getString("backgroundVideo") : "";
            }
            t1.d dVar = new t1.d(string, "image/jpeg", AppStateModule.APP_STATE_BACKGROUND, bool, this.f37337a);
            this.f37338b.setDataAndType(dVar.d(), dVar.c());
            this.f37338b.setFlags(1);
        }
        if (m.k("stickerImage", readableMap)) {
            t1.d dVar2 = new t1.d(readableMap.getString("stickerImage"), "image/png", "sticker", bool, this.f37337a);
            if (!valueOf.booleanValue()) {
                this.f37338b.setType("image/*");
            }
            this.f37338b.putExtra("interactive_asset_uri", dVar2.d());
            currentActivity.grantUriPermission("com.instagram.android", dVar2.d(), 1);
        }
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
        r(readableMap);
        q(readableMap);
    }
}
