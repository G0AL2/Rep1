package z5;

import android.util.SparseIntArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: DefaultNativeMemoryChunkPoolParams.java */
/* loaded from: classes.dex */
public class i {
    public static s a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(Constants.BUFFER_SIZE, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(Constants.MIN_PROGRESS_STEP, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        return new s(c(), b(), sparseIntArray);
    }

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return min / 2;
        }
        return (min / 4) * 3;
    }

    private static int c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 3145728;
        }
        return min < 33554432 ? 6291456 : 12582912;
    }
}
