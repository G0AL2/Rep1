package com.bytedance.sdk.openadsdk.core.j.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.core.j.b.c;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.List;
import org.json.JSONObject;

/* compiled from: VastXmlParser.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: e  reason: collision with root package name */
    public static int f12413e;

    /* renamed from: a  reason: collision with root package name */
    protected int f12414a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f12415b;

    /* renamed from: c  reason: collision with root package name */
    protected int f12416c;

    /* renamed from: d  reason: collision with root package name */
    protected double f12417d;

    public b(Context context, int i10, int i11) {
        this.f12416c = RecyclerView.UNDEFINED_DURATION;
        this.f12417d = Double.MIN_VALUE;
        if (i11 > 0 && i10 > 0) {
            this.f12417d = i10 / i11;
        }
        float e10 = v.e(context);
        if (e10 != 0.0f) {
            this.f12416c = (int) (i10 / e10);
        }
        this.f12415b = context.getApplicationContext();
    }

    protected void a(Exception exc, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i10);
            com.bytedance.sdk.openadsdk.h.b.a().a("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(String str, List<c> list) {
        String str2;
        int i10 = this.f12414a;
        if (i10 >= 5) {
            return null;
        }
        this.f12414a = i10 + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.e.b.b c10 = d.a().b().c();
            c10.a(str);
            com.bytedance.sdk.component.e.b a10 = c10.a();
            str2 = a10.d();
            try {
                a10.a();
            } catch (Exception e10) {
                e = e10;
                a(e, 0);
                if (!list.isEmpty()) {
                    c.b(list, a.WRAPPER_TIMEOUT, -1L, null);
                }
                return str2;
            }
        } catch (Exception e11) {
            e = e11;
            str2 = null;
        }
        return str2;
    }
}
