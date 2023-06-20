package x7;

import android.content.Context;

/* compiled from: CreationContextFactory.java */
/* loaded from: classes2.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f38688a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a f38689b;

    /* renamed from: c  reason: collision with root package name */
    private final h8.a f38690c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, h8.a aVar, h8.a aVar2) {
        this.f38688a = context;
        this.f38689b = aVar;
        this.f38690c = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.datatransport.runtime.backends.f a(String str) {
        return com.google.android.datatransport.runtime.backends.f.a(this.f38688a, this.f38689b, this.f38690c, str);
    }
}
