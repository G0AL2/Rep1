package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgiq;
import com.google.android.gms.internal.ads.zzgir;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgir<MessageType extends zzgir<MessageType, BuilderType>, BuilderType extends zzgiq<MessageType, BuilderType>> implements zzgma {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static void zzat(Iterable iterable, List list) {
        zzgla.zze(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                int size2 = list.size();
                String str = "Element at index " + (size2 - size) + " is null.";
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        break;
                    }
                    list.remove(size3);
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzar() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final zzgji zzas() {
        try {
            int zzax = zzax();
            zzgji zzgjiVar = zzgji.zzb;
            byte[] bArr = new byte[zzax];
            zzgjx zzG = zzgjx.zzG(bArr);
            zzaQ(zzG);
            zzG.zzI();
            return new zzgje(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzau(int i10) {
        throw null;
    }

    public final void zzav(OutputStream outputStream) throws IOException {
        zzgjx zzH = zzgjx.zzH(outputStream, zzgjx.zzB(zzax()));
        zzaQ(zzH);
        zzH.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final byte[] zzaw() {
        try {
            byte[] bArr = new byte[zzax()];
            zzgjx zzG = zzgjx.zzG(bArr);
            zzaQ(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
