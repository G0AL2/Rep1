package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes2.dex */
public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f19801a;

    public k(i iVar) {
        this.f19801a = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i iVar = this.f19801a;
        int i10 = iVar.C + 200;
        iVar.C = i10;
        iVar.f19786v.setProgress(i10);
        i iVar2 = this.f19801a;
        if (iVar2.C == iVar2.D) {
            iVar2.E = null;
            iVar2.C = 0;
            iVar2.D = 0;
            return;
        }
        iVar2.postDelayed(iVar2.E, 200L);
    }
}
