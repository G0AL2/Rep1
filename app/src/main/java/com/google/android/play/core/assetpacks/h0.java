package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final cb.d0<d3> f22853a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(cb.d0<d3> d0Var) {
        this.f22853a = d0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InputStream a(int i10, String str, String str2, int i11) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) gb.g.e(this.f22853a.a().a(i10, str, str2, i11));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new s0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), i10);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e10) {
            throw new s0("Extractor was interrupted while waiting for chunk file.", e10, i10);
        } catch (ExecutionException e11) {
            throw new s0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), e11, i10);
        }
    }
}
