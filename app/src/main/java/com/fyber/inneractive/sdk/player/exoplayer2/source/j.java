package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.source.i;

/* loaded from: classes2.dex */
public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i.d f19310a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f19311b;

    public j(i iVar, i.d dVar) {
        this.f19311b = iVar;
        this.f19310a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i.d dVar = this.f19310a;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.f fVar = dVar.f19307c;
        if (fVar != null) {
            fVar.b();
            dVar.f19307c = null;
        }
        int size = this.f19311b.f19281o.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19311b.f19281o.valueAt(i10).b();
        }
    }
}
