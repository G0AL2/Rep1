package hb;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31403a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31404b;

    /* renamed from: c  reason: collision with root package name */
    private final hb.a f31405c;

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f31406a;

        /* renamed from: b  reason: collision with root package name */
        private String f31407b;

        /* renamed from: c  reason: collision with root package name */
        private hb.a f31408c;

        @RecentlyNonNull
        public d a() {
            return new d(this, null);
        }

        @RecentlyNonNull
        public a b(hb.a aVar) {
            this.f31408c = aVar;
            return this;
        }

        @RecentlyNonNull
        public a c(boolean z10) {
            this.f31406a = z10;
            return this;
        }
    }

    /* synthetic */ d(a aVar, h hVar) {
        this.f31403a = aVar.f31406a;
        this.f31404b = aVar.f31407b;
        this.f31405c = aVar.f31408c;
    }

    @RecentlyNullable
    public hb.a a() {
        return this.f31405c;
    }

    public boolean b() {
        return this.f31403a;
    }

    @RecentlyNullable
    public final String c() {
        return this.f31404b;
    }
}
