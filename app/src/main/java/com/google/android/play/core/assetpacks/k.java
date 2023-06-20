package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
class k<T> extends cb.o0 {

    /* renamed from: a  reason: collision with root package name */
    final gb.p<T> f22889a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p f22890b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(p pVar, gb.p<T> pVar2) {
        this.f22890b = pVar;
        this.f22889a = pVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(p pVar, gb.p pVar2, byte[] bArr) {
        this(pVar, pVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(p pVar, gb.p pVar2, char[] cArr) {
        this(pVar, pVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(p pVar, gb.p pVar2, int[] iArr) {
        this(pVar, pVar2);
    }

    @Override // cb.p0
    public void L(Bundle bundle, Bundle bundle2) {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // cb.p0
    public void M(int i10, Bundle bundle) {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onStartDownload(%d)", Integer.valueOf(i10));
    }

    @Override // cb.p0
    public void N(Bundle bundle) {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // cb.p0
    public void a() {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onCancelDownloads()", new Object[0]);
    }

    @Override // cb.p0
    public final void a(int i10) {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onCancelDownload(%d)", Integer.valueOf(i10));
    }

    @Override // cb.p0
    public void a(Bundle bundle) {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        int i10 = bundle.getInt("error_code");
        eVar = p.f22960f;
        eVar.e("onError(%d)", Integer.valueOf(i10));
        this.f22889a.d(new a(i10));
    }

    @Override // cb.p0
    public void a(List<Bundle> list) {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onGetSessionStates", new Object[0]);
    }

    @Override // cb.p0
    public void b() {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onRemoveModule()", new Object[0]);
    }

    @Override // cb.p0
    public final void b(int i10) {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onGetSession(%d)", Integer.valueOf(i10));
    }

    @Override // cb.p0
    public void b(Bundle bundle, Bundle bundle2) {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22965d;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // cb.p0
    public void c(Bundle bundle) {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // cb.p0
    public void f(Bundle bundle) {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // cb.p0
    public void h(Bundle bundle, Bundle bundle2) throws RemoteException {
        cb.o oVar;
        cb.e eVar;
        oVar = this.f22890b.f22964c;
        oVar.b();
        eVar = p.f22960f;
        eVar.f("onGetChunkFileDescriptor", new Object[0]);
    }
}
