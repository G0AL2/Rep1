package h7;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.l;
import com.facebook.react.views.text.v;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Locale;

/* compiled from: FrescoBasedReactTextInlineImageShadowNode.java */
/* loaded from: classes.dex */
public class a extends l {
    private ReadableMap A;
    private final r4.b B;
    private final Object C;
    private String E;

    /* renamed from: z  reason: collision with root package name */
    private Uri f31112z;
    private float D = Float.NaN;
    private float F = Float.NaN;
    private int G = 0;

    public a(r4.b bVar, Object obj) {
        this.B = bVar;
        this.C = obj;
    }

    private static Uri u1(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace(Constants.FILENAME_SEQUENCE_SEPARATOR, "_"), "drawable", context.getPackageName()))).build();
    }

    @Override // com.facebook.react.uimanager.e0, com.facebook.react.uimanager.d0
    public boolean R() {
        return true;
    }

    @Override // com.facebook.react.views.text.l
    public v q1() {
        return new b(U().getResources(), (int) Math.ceil(this.F), (int) Math.ceil(this.D), this.G, v1(), t1(), s1(), r1(), this.E);
    }

    public Object r1() {
        return this.C;
    }

    public r4.b s1() {
        return this.B;
    }

    @w6.a(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.A = readableMap;
    }

    @Override // com.facebook.react.uimanager.j
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.F = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based height");
    }

    @w6.a(name = "resizeMode")
    public void setResizeMode(String str) {
        this.E = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r1.getScheme() == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    @w6.a(name = "src")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSource(com.facebook.react.bridge.ReadableArray r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L16
            int r1 = r4.size()
            if (r1 != 0) goto La
            goto L16
        La:
            r1 = 0
            com.facebook.react.bridge.ReadableMap r4 = r4.getMap(r1)
            java.lang.String r1 = "uri"
            java.lang.String r4 = r4.getString(r1)
            goto L17
        L16:
            r4 = r0
        L17:
            if (r4 == 0) goto L31
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L26
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Exception -> L24
            if (r2 != 0) goto L24
            goto L27
        L24:
            r0 = r1
            goto L27
        L26:
        L27:
            if (r0 != 0) goto L31
            com.facebook.react.uimanager.n0 r0 = r3.U()
            android.net.Uri r0 = u1(r0, r4)
        L31:
            android.net.Uri r4 = r3.f31112z
            if (r0 == r4) goto L38
            r3.x0()
        L38:
            r3.f31112z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.a.setSource(com.facebook.react.bridge.ReadableArray):void");
    }

    @w6.a(customType = "Color", name = "tintColor")
    public void setTintColor(int i10) {
        this.G = i10;
    }

    @Override // com.facebook.react.uimanager.j
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.D = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based width");
    }

    public ReadableMap t1() {
        return this.A;
    }

    public Uri v1() {
        return this.f31112z;
    }
}
