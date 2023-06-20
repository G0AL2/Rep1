package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.Queue;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzftl {
    private static final OutputStream zza = new zzftk();

    public static byte[] zza(InputStream inputStream) throws IOException {
        Objects.requireNonNull(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min((int) Constants.BUFFER_SIZE, Math.max(128, highestOneBit + highestOneBit));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = inputStream.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return zzb(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            long j10 = min * (min < 4096 ? 4 : 2);
            min = j10 > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : j10 < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j10;
        }
        if (inputStream.read() == -1) {
            return zzb(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] zzb(Queue queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i10) {
            return bArr;
        }
        int i11 = i10 - length;
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        while (i11 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i11, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - i11, min);
            i11 -= min;
        }
        return copyOf;
    }
}
