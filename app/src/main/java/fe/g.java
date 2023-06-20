package fe;

import com.google.android.gms.common.api.Api;

/* compiled from: ArrayDeque.kt */
/* loaded from: classes3.dex */
public final class g<E> extends d<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30327a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final Object[] f30328b = new Object[0];

    /* compiled from: ArrayDeque.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                if (i11 > 2147483639) {
                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                return 2147483639;
            }
            return i12;
        }
    }
}
