package com.inmobi.media;

import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NativeScrollableDataSourceFactory.java */
/* loaded from: classes3.dex */
public final class fh {
    public static fg a(byte b10, bx bxVar, fc fcVar) {
        if (b10 != 0) {
            if (b10 != 1) {
                return null;
            }
            try {
                return new NativeRecyclerViewAdapter(bxVar, fcVar);
            } catch (NoClassDefFoundError e10) {
                hu.a((byte) 1, "InMobi", "Error rendering ad! RecyclerView not found. Please check if the recyclerview support library was included");
                gg.a().a(new hg(e10));
                return null;
            }
        }
        return new fa(bxVar, fcVar);
    }
}
