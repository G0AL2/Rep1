package n8;

import android.util.Pair;
import java.util.Map;

/* compiled from: WidevineUtil.java */
/* loaded from: classes2.dex */
public final class w {
    private static long a(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
                return -9223372036854775807L;
            } catch (NumberFormatException unused) {
                return -9223372036854775807L;
            }
        }
        return -9223372036854775807L;
    }

    public static Pair<Long, Long> b(com.google.android.exoplayer2.drm.j jVar) {
        Map<String, String> f10 = jVar.f();
        if (f10 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(f10, "LicenseDurationRemaining")), Long.valueOf(a(f10, "PlaybackDurationRemaining")));
    }
}
