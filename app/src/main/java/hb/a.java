package hb;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzbx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31397a;

    /* renamed from: b  reason: collision with root package name */
    private final int f31398b;

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* renamed from: hb.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0399a {

        /* renamed from: b  reason: collision with root package name */
        private final Context f31400b;

        /* renamed from: d  reason: collision with root package name */
        private boolean f31402d;

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f31399a = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private int f31401c = 0;

        public C0399a(@RecentlyNonNull Context context) {
            this.f31400b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public C0399a a(@RecentlyNonNull String str) {
            this.f31399a.add(str);
            return this;
        }

        @RecentlyNonNull
        public a b() {
            Context context = this.f31400b;
            List<String> list = this.f31399a;
            boolean z10 = true;
            if (!zzbx.zzb() && !list.contains(zzbx.zza(context)) && !this.f31402d) {
                z10 = false;
            }
            return new a(z10, this, null);
        }

        @RecentlyNonNull
        public C0399a c(int i10) {
            this.f31401c = i10;
            return this;
        }
    }

    /* synthetic */ a(boolean z10, C0399a c0399a, g gVar) {
        this.f31397a = z10;
        this.f31398b = c0399a.f31401c;
    }

    public int a() {
        return this.f31398b;
    }

    public boolean b() {
        return this.f31397a;
    }
}
