package cb;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class r {
    public static void a(PackageManager packageManager, ComponentName componentName, int i10) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i10 | AdRequest.MAX_CONTENT_URL_LENGTH);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i11 = 0;
                    loop0: while (true) {
                        if (i11 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i11];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i12 = 0; i12 < length; i12++) {
                                componentInfo = componentInfoArr2[i12];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i11++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    public static void b(u uVar, InputStream inputStream, OutputStream outputStream, long j10) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
            throw new t(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read != 4) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unexpected version=");
            sb2.append(read);
            throw new t(sb2.toString());
        }
        long j11 = 0;
        while (true) {
            long j12 = j10 - j11;
            try {
                int read2 = dataInputStream.read();
                if (read2 == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (read2 == 0) {
                    return;
                }
                switch (read2) {
                    case 247:
                        read2 = dataInputStream.readUnsignedShort();
                        f(bArr, dataInputStream, outputStream, read2, j12);
                        break;
                    case 248:
                        read2 = dataInputStream.readInt();
                        f(bArr, dataInputStream, outputStream, read2, j12);
                        break;
                    case 249:
                        long readUnsignedShort = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        e(bArr, uVar, outputStream, readUnsignedShort, read2, j12);
                        break;
                    case IronSourceConstants.INTERSTITIAL_DAILY_CAPPED /* 250 */:
                        read2 = dataInputStream.readUnsignedShort();
                        e(bArr, uVar, outputStream, dataInputStream.readUnsignedShort(), read2, j12);
                        break;
                    case 251:
                        read2 = dataInputStream.readInt();
                        e(bArr, uVar, outputStream, dataInputStream.readUnsignedShort(), read2, j12);
                        break;
                    case 252:
                        long readInt2 = dataInputStream.readInt();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        e(bArr, uVar, outputStream, readInt2, read2, j12);
                        break;
                    case 253:
                        read2 = dataInputStream.readUnsignedShort();
                        e(bArr, uVar, outputStream, dataInputStream.readInt(), read2, j12);
                        break;
                    case 254:
                        read2 = dataInputStream.readInt();
                        e(bArr, uVar, outputStream, dataInputStream.readInt(), read2, j12);
                        break;
                    case 255:
                        long readLong = dataInputStream.readLong();
                        read2 = dataInputStream.readInt();
                        e(bArr, uVar, outputStream, readLong, read2, j12);
                        break;
                    default:
                        f(bArr, dataInputStream, outputStream, read2, j12);
                        break;
                }
                j11 += read2;
            } finally {
                outputStream.flush();
            }
        }
    }

    public static <T> void c(T t10) {
        Objects.requireNonNull(t10);
    }

    public static <T> void d(T t10, Class<T> cls) {
        if (t10 == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    private static void e(byte[] bArr, u uVar, OutputStream outputStream, long j10, int i10, long j11) throws IOException {
        int i11 = i10;
        if (i11 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j10 < 0) {
            throw new IOException("inputOffset negative");
        }
        long j12 = i11;
        if (j12 > j11) {
            throw new IOException("Output length overrun");
        }
        try {
            InputStream d10 = new v(uVar, j10, j12).d();
            while (i11 > 0) {
                int min = Math.min(i11, 16384);
                int i12 = 0;
                while (i12 < min) {
                    int read = d10.read(bArr, i12, min - i12);
                    if (read == -1) {
                        throw new IOException("truncated input stream");
                    }
                    i12 += read;
                }
                outputStream.write(bArr, 0, min);
                i11 -= min;
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (EOFException e10) {
            throw new IOException("patch underrun", e10);
        }
    }

    private static void f(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i10, long j10) throws IOException {
        if (i10 < 0) {
            throw new IOException("copyLength negative");
        }
        if (i10 > j10) {
            throw new IOException("Output length overrun");
        }
        while (i10 > 0) {
            try {
                int min = Math.min(i10, 16384);
                dataInputStream.readFully(bArr, 0, min);
                outputStream.write(bArr, 0, min);
                i10 -= min;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }

    public static <T> void g(T t10) {
        Objects.requireNonNull(t10, "Cannot return null from a non-@Nullable @Provides method");
    }
}
