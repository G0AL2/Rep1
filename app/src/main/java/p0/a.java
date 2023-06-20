package p0;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.inmobi.media.jh;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* compiled from: ExifInterface.java */
/* loaded from: classes.dex */
public class a {
    private static final c[] A;
    private static final c[] B;
    private static final c C;
    private static final c[] D;
    private static final c[] E;
    private static final c[] F;
    private static final c[] G;
    static final c[][] H;
    private static final c[] I;
    private static final HashMap<Integer, ExifInterface.ExifTag>[] J;
    private static final HashMap<String, ExifInterface.ExifTag>[] K;
    private static final HashSet<String> L;
    private static final HashMap<Integer, Integer> M;
    static final Charset N;
    static final byte[] O;

    /* renamed from: t  reason: collision with root package name */
    private static SimpleDateFormat f35391t;

    /* renamed from: x  reason: collision with root package name */
    private static final c[] f35395x;

    /* renamed from: y  reason: collision with root package name */
    private static final c[] f35396y;

    /* renamed from: z  reason: collision with root package name */
    private static final c[] f35397z;

    /* renamed from: a  reason: collision with root package name */
    private final String f35398a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager.AssetInputStream f35399b;

    /* renamed from: c  reason: collision with root package name */
    private int f35400c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, ExifInterface.ExifAttribute>[] f35401d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Integer> f35402e;

    /* renamed from: f  reason: collision with root package name */
    private ByteOrder f35403f;

    /* renamed from: g  reason: collision with root package name */
    private int f35404g;

    /* renamed from: h  reason: collision with root package name */
    private int f35405h;

    /* renamed from: i  reason: collision with root package name */
    private int f35406i;

    /* renamed from: j  reason: collision with root package name */
    private int f35407j;

    /* renamed from: k  reason: collision with root package name */
    private int f35408k;

    /* renamed from: l  reason: collision with root package name */
    private int f35409l;

    /* renamed from: m  reason: collision with root package name */
    private static final List<Integer> f35384m = Arrays.asList(1, 6, 3, 8);

    /* renamed from: n  reason: collision with root package name */
    private static final List<Integer> f35385n = Arrays.asList(2, 7, 4, 5);

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f35386o = {8, 8, 8};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f35387p = {8};

    /* renamed from: q  reason: collision with root package name */
    static final byte[] f35388q = {-1, -40, -1};

    /* renamed from: r  reason: collision with root package name */
    private static final byte[] f35389r = {79, 76, 89, 77, 80, 0};

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f35390s = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: u  reason: collision with root package name */
    static final String[] f35392u = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: v  reason: collision with root package name */
    static final int[] f35393v = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: w  reason: collision with root package name */
    static final byte[] f35394w = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f35416a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35417b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f35418c;

        b(int i10, int i11, byte[] bArr) {
            this.f35416a = i10;
            this.f35417b = i11;
            this.f35418c = bArr;
        }

        public static b a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.N);
            return new b(2, bytes.length, bytes);
        }

        public static b b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static b c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f35393v[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new b(4, jArr.length, wrap.array());
        }

        public static b d(d dVar, ByteOrder byteOrder) {
            return e(new d[]{dVar}, byteOrder);
        }

        public static b e(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f35393v[5] * dVarArr.length]);
            wrap.order(byteOrder);
            for (d dVar : dVarArr) {
                wrap.putInt((int) dVar.f35423a);
                wrap.putInt((int) dVar.f35424b);
            }
            return new b(5, dVarArr.length, wrap.array());
        }

        public static b f(int i10, ByteOrder byteOrder) {
            return g(new int[]{i10}, byteOrder);
        }

        public static b g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f35393v[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new b(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 != null) {
                if (k10 instanceof String) {
                    return Double.parseDouble((String) k10);
                }
                if (k10 instanceof long[]) {
                    long[] jArr = (long[]) k10;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof int[]) {
                    int[] iArr = (int[]) k10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof double[]) {
                    double[] dArr = (double[]) k10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof d[]) {
                    d[] dVarArr = (d[]) k10;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int i(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 != null) {
                if (k10 instanceof String) {
                    return Integer.parseInt((String) k10);
                }
                if (k10 instanceof long[]) {
                    long[] jArr = (long[]) k10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k10 instanceof int[]) {
                    int[] iArr = (int[]) k10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String j(ByteOrder byteOrder) {
            Object k10 = k(byteOrder);
            if (k10 == null) {
                return null;
            }
            if (k10 instanceof String) {
                return (String) k10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (k10 instanceof long[]) {
                long[] jArr = (long[]) k10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (k10 instanceof int[]) {
                int[] iArr = (int[]) k10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (k10 instanceof double[]) {
                double[] dArr = (double[]) k10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (k10 instanceof d[]) {
                d[] dVarArr = (d[]) k10;
                while (i10 < dVarArr.length) {
                    sb2.append(dVarArr[i10].f35423a);
                    sb2.append('/');
                    sb2.append(dVarArr[i10].f35424b);
                    i10++;
                    if (i10 != dVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019c */
        /* JADX WARN: Removed duplicated region for block: B:176:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object k(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.a.b.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.f35392u[this.f35416a] + ", data length:" + this.f35418c.length + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f35423a;

        /* renamed from: b  reason: collision with root package name */
        public final long f35424b;

        d(long j10, long j11) {
            if (j11 == 0) {
                this.f35423a = 0L;
                this.f35424b = 1L;
                return;
            }
            this.f35423a = j10;
            this.f35424b = j11;
        }

        public double a() {
            return this.f35423a / this.f35424b;
        }

        public String toString() {
            return this.f35423a + "/" + this.f35424b;
        }
    }

    static {
        ExifInterface.ExifTag[] exifTagArr;
        c[] cVarArr = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", IronSourceConstants.OFFERWALL_OPENED, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", ms.bd.o.Pgl.c.COLLECT_MODE_TIKTOKLITE, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        f35395x = cVarArr;
        c[] cVarArr2 = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        f35396y = cVarArr2;
        c[] cVarArr3 = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        f35397z = cVarArr3;
        c[] cVarArr4 = {new c("InteroperabilityIndex", 1, 2)};
        A = cVarArr4;
        c[] cVarArr5 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", IronSourceConstants.OFFERWALL_OPENED, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", ms.bd.o.Pgl.c.COLLECT_MODE_TIKTOKLITE, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
        B = cVarArr5;
        C = new c("StripOffsets", 273, 3);
        c[] cVarArr6 = {new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
        D = cVarArr6;
        c[] cVarArr7 = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
        E = cVarArr7;
        c[] cVarArr8 = {new c("AspectFrame", 4371, 3)};
        F = cVarArr8;
        c[] cVarArr9 = {new c("ColorSpace", 55, 3)};
        G = cVarArr9;
        c[][] cVarArr10 = {cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, cVarArr6, cVarArr7, cVarArr8, cVarArr9};
        H = cVarArr10;
        I = new c[]{new c("SubIFDPointer", ms.bd.o.Pgl.c.COLLECT_MODE_TIKTOKLITE, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        new c("JPEGInterchangeFormat", 513, 4);
        new c("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4);
        J = new HashMap[cVarArr10.length];
        K = new HashMap[cVarArr10.length];
        L = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        N = forName;
        O = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f35391t = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            ExifInterface.ExifTag[][] exifTagArr2 = H;
            if (i10 < exifTagArr2.length) {
                J[i10] = new HashMap<>();
                K[i10] = new HashMap<>();
                for (ExifInterface.ExifTag exifTag : exifTagArr2[i10]) {
                    J[i10].put(Integer.valueOf(exifTag.f35419a), exifTag);
                    K[i10].put(exifTag.f35420b, exifTag);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = M;
                c[] cVarArr11 = I;
                hashMap.put(Integer.valueOf(cVarArr11[0].f35419a), 5);
                hashMap.put(Integer.valueOf(cVarArr11[1].f35419a), 1);
                hashMap.put(Integer.valueOf(cVarArr11[2].f35419a), 2);
                hashMap.put(Integer.valueOf(cVarArr11[3].f35419a), 3);
                hashMap.put(Integer.valueOf(cVarArr11[4].f35419a), 7);
                hashMap.put(Integer.valueOf(cVarArr11[5].f35419a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public a(String str) throws IOException {
        FileInputStream fileInputStream;
        c[][] cVarArr = H;
        this.f35401d = new HashMap[cVarArr.length];
        this.f35402e = new HashSet(cVarArr.length);
        this.f35403f = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.f35399b = null;
            this.f35398a = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                u(fileInputStream);
                b(fileInputStream);
                return;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                b(fileInputStream2);
                throw th;
            }
        }
        throw new IllegalArgumentException("filename cannot be null");
    }

    private void A(C0471a c0471a) throws IOException {
        HashMap<String, ExifInterface.ExifAttribute> hashMap = this.f35401d[4];
        b bVar = hashMap.get("Compression");
        if (bVar != null) {
            int i10 = bVar.i(this.f35403f);
            this.f35404g = i10;
            if (i10 != 1) {
                if (i10 == 6) {
                    m(c0471a, hashMap);
                    return;
                } else if (i10 != 7) {
                    return;
                }
            }
            if (s(hashMap)) {
                n(c0471a, hashMap);
                return;
            }
            return;
        }
        this.f35404g = 6;
        m(c0471a, hashMap);
    }

    private void B(int i10, int i11) throws IOException {
        if (this.f35401d[i10].isEmpty() || this.f35401d[i11].isEmpty()) {
            return;
        }
        b bVar = this.f35401d[i10].get("ImageLength");
        b bVar2 = this.f35401d[i10].get("ImageWidth");
        b bVar3 = this.f35401d[i11].get("ImageLength");
        b bVar4 = this.f35401d[i11].get("ImageWidth");
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int i12 = bVar.i(this.f35403f);
        int i13 = bVar2.i(this.f35403f);
        int i14 = bVar3.i(this.f35403f);
        int i15 = bVar4.i(this.f35403f);
        if (i12 >= i14 || i13 >= i15) {
            return;
        }
        HashMap<String, ExifInterface.ExifAttribute>[] hashMapArr = this.f35401d;
        HashMap<String, ExifInterface.ExifAttribute> hashMap = hashMapArr[i10];
        hashMapArr[i10] = hashMapArr[i11];
        hashMapArr[i11] = hashMap;
    }

    private void C(C0471a c0471a, int i10) throws IOException {
        b f10;
        b f11;
        b bVar = this.f35401d[i10].get("DefaultCropSize");
        b bVar2 = this.f35401d[i10].get("SensorTopBorder");
        b bVar3 = this.f35401d[i10].get("SensorLeftBorder");
        b bVar4 = this.f35401d[i10].get("SensorBottomBorder");
        b bVar5 = this.f35401d[i10].get("SensorRightBorder");
        if (bVar == null) {
            if (bVar2 != null && bVar3 != null && bVar4 != null && bVar5 != null) {
                int i11 = bVar2.i(this.f35403f);
                int i12 = bVar4.i(this.f35403f);
                int i13 = bVar5.i(this.f35403f);
                int i14 = bVar3.i(this.f35403f);
                if (i12 <= i11 || i13 <= i14) {
                    return;
                }
                ExifInterface.ExifAttribute f12 = b.f(i12 - i11, this.f35403f);
                ExifInterface.ExifAttribute f13 = b.f(i13 - i14, this.f35403f);
                this.f35401d[i10].put("ImageLength", f12);
                this.f35401d[i10].put("ImageWidth", f13);
                return;
            }
            z(c0471a, i10);
            return;
        }
        if (bVar.f35416a == 5) {
            d[] dVarArr = (d[]) bVar.k(this.f35403f);
            if (dVarArr != null && dVarArr.length == 2) {
                f10 = b.d(dVarArr[0], this.f35403f);
                f11 = b.d(dVarArr[1], this.f35403f);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(dVarArr));
                return;
            }
        } else {
            int[] iArr = (int[]) bVar.k(this.f35403f);
            if (iArr != null && iArr.length == 2) {
                f10 = b.f(iArr[0], this.f35403f);
                f11 = b.f(iArr[1], this.f35403f);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
        }
        this.f35401d[i10].put("ImageWidth", f10);
        this.f35401d[i10].put("ImageLength", f11);
    }

    private void D(InputStream inputStream) throws IOException {
        B(0, 5);
        B(0, 4);
        B(5, 4);
        ExifInterface.ExifAttribute exifAttribute = (b) this.f35401d[1].get("PixelXDimension");
        ExifInterface.ExifAttribute exifAttribute2 = (b) this.f35401d[1].get("PixelYDimension");
        if (exifAttribute != null && exifAttribute2 != null) {
            this.f35401d[0].put("ImageWidth", exifAttribute);
            this.f35401d[0].put("ImageLength", exifAttribute2);
        }
        if (this.f35401d[4].isEmpty() && t(this.f35401d[5])) {
            HashMap<String, ExifInterface.ExifAttribute>[] hashMapArr = this.f35401d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (t(this.f35401d[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    private void a() {
        String d10 = d("DateTimeOriginal");
        if (d10 != null && d("DateTime") == null) {
            this.f35401d[0].put("DateTime", b.a(d10));
        }
        if (d("ImageWidth") == null) {
            this.f35401d[0].put("ImageWidth", b.b(0L, this.f35403f));
        }
        if (d("ImageLength") == null) {
            this.f35401d[0].put("ImageLength", b.b(0L, this.f35403f));
        }
        if (d("Orientation") == null) {
            this.f35401d[0].put("Orientation", b.b(0L, this.f35403f));
        }
        if (d("LightSource") == null) {
            this.f35401d[1].put("LightSource", b.b(0L, this.f35403f));
        }
    }

    private static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    private static long[] c(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = iArr[i10];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private b f(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < H.length; i10++) {
            b bVar = this.f35401d[i10].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
        r10.e(r9.f35403f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g(p0.a.C0471a r10, int r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.g(p0.a$a, int, int):void");
    }

    private int h(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(jh.DEFAULT_BITMAP_TIMEOUT);
        byte[] bArr = new byte[jh.DEFAULT_BITMAP_TIMEOUT];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (o(bArr)) {
            return 4;
        }
        if (q(bArr)) {
            return 9;
        }
        if (p(bArr)) {
            return 7;
        }
        return r(bArr) ? 10 : 0;
    }

    private void i(C0471a c0471a) throws IOException {
        k(c0471a);
        b bVar = this.f35401d[1].get("MakerNote");
        if (bVar != null) {
            C0471a c0471a2 = new C0471a(bVar.f35418c);
            c0471a2.e(this.f35403f);
            byte[] bArr = f35389r;
            byte[] bArr2 = new byte[bArr.length];
            c0471a2.readFully(bArr2);
            c0471a2.d(0L);
            byte[] bArr3 = f35390s;
            byte[] bArr4 = new byte[bArr3.length];
            c0471a2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0471a2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0471a2.d(12L);
            }
            y(c0471a2, 6);
            ExifInterface.ExifAttribute exifAttribute = (b) this.f35401d[7].get("PreviewImageStart");
            ExifInterface.ExifAttribute exifAttribute2 = (b) this.f35401d[7].get("PreviewImageLength");
            if (exifAttribute != null && exifAttribute2 != null) {
                this.f35401d[5].put("JPEGInterchangeFormat", exifAttribute);
                this.f35401d[5].put("JPEGInterchangeFormatLength", exifAttribute2);
            }
            b bVar2 = this.f35401d[8].get("AspectFrame");
            if (bVar2 != null) {
                int[] iArr = (int[]) bVar2.k(this.f35403f);
                if (iArr != null && iArr.length == 4) {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i10 = (iArr[2] - iArr[0]) + 1;
                    int i11 = (iArr[3] - iArr[1]) + 1;
                    if (i10 < i11) {
                        int i12 = i10 + i11;
                        i11 = i12 - i11;
                        i10 = i12 - i11;
                    }
                    ExifInterface.ExifAttribute f10 = b.f(i10, this.f35403f);
                    ExifInterface.ExifAttribute f11 = b.f(i11, this.f35403f);
                    this.f35401d[0].put("ImageWidth", f10);
                    this.f35401d[0].put("ImageLength", f11);
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    private void j(C0471a c0471a) throws IOException {
        c0471a.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        c0471a.read(bArr);
        c0471a.skipBytes(4);
        c0471a.read(bArr2);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        g(c0471a, i10, 5);
        c0471a.d(i11);
        c0471a.e(ByteOrder.BIG_ENDIAN);
        int readInt = c0471a.readInt();
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = c0471a.readUnsignedShort();
            int readUnsignedShort2 = c0471a.readUnsignedShort();
            if (readUnsignedShort == C.f35419a) {
                short readShort = c0471a.readShort();
                short readShort2 = c0471a.readShort();
                ExifInterface.ExifAttribute f10 = b.f(readShort, this.f35403f);
                ExifInterface.ExifAttribute f11 = b.f(readShort2, this.f35403f);
                this.f35401d[0].put("ImageLength", f10);
                this.f35401d[0].put("ImageWidth", f11);
                return;
            }
            c0471a.skipBytes(readUnsignedShort2);
        }
    }

    private void k(C0471a c0471a) throws IOException {
        b bVar;
        v(c0471a, c0471a.available());
        y(c0471a, 0);
        C(c0471a, 0);
        C(c0471a, 5);
        C(c0471a, 4);
        D(c0471a);
        if (this.f35400c != 8 || (bVar = this.f35401d[1].get("MakerNote")) == null) {
            return;
        }
        C0471a c0471a2 = new C0471a(bVar.f35418c);
        c0471a2.e(this.f35403f);
        c0471a2.d(6L);
        y(c0471a2, 9);
        ExifInterface.ExifAttribute exifAttribute = (b) this.f35401d[9].get("ColorSpace");
        if (exifAttribute != null) {
            this.f35401d[1].put("ColorSpace", exifAttribute);
        }
    }

    private void l(C0471a c0471a) throws IOException {
        k(c0471a);
        if (this.f35401d[0].get("JpgFromRaw") != null) {
            g(c0471a, this.f35409l, 5);
        }
        ExifInterface.ExifAttribute exifAttribute = (b) this.f35401d[0].get("ISO");
        b bVar = this.f35401d[1].get("PhotographicSensitivity");
        if (exifAttribute == null || bVar != null) {
            return;
        }
        this.f35401d[1].put("PhotographicSensitivity", exifAttribute);
    }

    private void m(C0471a c0471a, HashMap hashMap) throws IOException {
        int i10;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar == null || bVar2 == null) {
            return;
        }
        int i11 = bVar.i(this.f35403f);
        int min = Math.min(bVar2.i(this.f35403f), c0471a.available() - i11);
        int i12 = this.f35400c;
        if (i12 == 4 || i12 == 9 || i12 == 10) {
            i10 = this.f35405h;
        } else {
            if (i12 == 7) {
                i10 = this.f35406i;
            }
            if (i11 > 0 || min <= 0 || this.f35398a != null || this.f35399b != null) {
                return;
            }
            c0471a.d(i11);
            c0471a.readFully(new byte[min]);
            return;
        }
        i11 += i10;
        if (i11 > 0) {
        }
    }

    private void n(C0471a c0471a, HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get("StripOffsets");
        b bVar2 = (b) hashMap.get("StripByteCounts");
        if (bVar == null || bVar2 == null) {
            return;
        }
        long[] c10 = c(bVar.k(this.f35403f));
        long[] c11 = c(bVar2.k(this.f35403f));
        if (c10 == null) {
            Log.w("ExifInterface", "stripOffsets should not be null.");
        } else if (c11 == null) {
            Log.w("ExifInterface", "stripByteCounts should not be null.");
        } else {
            long j10 = 0;
            for (long j11 : c11) {
                j10 += j11;
            }
            byte[] bArr = new byte[(int) j10];
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < c10.length; i12++) {
                int i13 = (int) c10[i12];
                int i14 = (int) c11[i12];
                int i15 = i13 - i10;
                if (i15 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                }
                c0471a.d(i15);
                int i16 = i10 + i15;
                byte[] bArr2 = new byte[i14];
                c0471a.read(bArr2);
                i10 = i16 + i14;
                System.arraycopy(bArr2, 0, bArr, i11, i14);
                i11 += i14;
            }
        }
    }

    private static boolean o(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f35388q;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean p(byte[] bArr) throws IOException {
        C0471a c0471a = new C0471a(bArr);
        ByteOrder w10 = w(c0471a);
        this.f35403f = w10;
        c0471a.e(w10);
        short readShort = c0471a.readShort();
        c0471a.close();
        return readShort == 20306 || readShort == 21330;
    }

    private boolean q(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean r(byte[] bArr) throws IOException {
        C0471a c0471a = new C0471a(bArr);
        ByteOrder w10 = w(c0471a);
        this.f35403f = w10;
        c0471a.e(w10);
        short readShort = c0471a.readShort();
        c0471a.close();
        return readShort == 85;
    }

    private boolean s(HashMap hashMap) throws IOException {
        b bVar;
        b bVar2 = (b) hashMap.get("BitsPerSample");
        if (bVar2 != null) {
            int[] iArr = (int[]) bVar2.k(this.f35403f);
            int[] iArr2 = f35386o;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f35400c != 3 || (bVar = (b) hashMap.get("PhotometricInterpretation")) == null) {
                return false;
            }
            int i10 = bVar.i(this.f35403f);
            return (i10 == 1 && Arrays.equals(iArr, f35387p)) || (i10 == 6 && Arrays.equals(iArr, iArr2));
        }
        return false;
    }

    private boolean t(HashMap hashMap) throws IOException {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.i(this.f35403f) <= 512 && bVar2.i(this.f35403f) <= 512;
    }

    private void u(InputStream inputStream) throws IOException {
        for (int i10 = 0; i10 < H.length; i10++) {
            try {
                this.f35401d[i10] = new HashMap<>();
            } catch (IOException unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, jh.DEFAULT_BITMAP_TIMEOUT);
        this.f35400c = h(bufferedInputStream);
        C0471a c0471a = new C0471a(bufferedInputStream);
        switch (this.f35400c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                k(c0471a);
                break;
            case 4:
                g(c0471a, 0, 0);
                break;
            case 7:
                i(c0471a);
                break;
            case 9:
                j(c0471a);
                break;
            case 10:
                l(c0471a);
                break;
        }
        A(c0471a);
        a();
    }

    private void v(C0471a c0471a, int i10) throws IOException {
        ByteOrder w10 = w(c0471a);
        this.f35403f = w10;
        c0471a.e(w10);
        int readUnsignedShort = c0471a.readUnsignedShort();
        int i11 = this.f35400c;
        if (i11 != 7 && i11 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c0471a.readInt();
        if (readInt >= 8 && readInt < i10) {
            int i12 = readInt - 8;
            if (i12 <= 0 || c0471a.skipBytes(i12) == i12) {
                return;
            }
            throw new IOException("Couldn't jump to first Ifd: " + i12);
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    private ByteOrder w(C0471a c0471a) throws IOException {
        short readShort = c0471a.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void x(byte[] bArr, int i10) throws IOException {
        C0471a c0471a = new C0471a(bArr);
        v(c0471a, bArr.length);
        y(c0471a, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y(p0.a.C0471a r25, int r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.a.y(p0.a$a, int):void");
    }

    private void z(C0471a c0471a, int i10) throws IOException {
        b bVar;
        b bVar2 = this.f35401d[i10].get("ImageLength");
        b bVar3 = this.f35401d[i10].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.f35401d[i10].get("JPEGInterchangeFormat")) != null) {
            g(c0471a, bVar.i(this.f35403f), i10);
        }
    }

    public String d(String str) {
        b f10 = f(str);
        if (f10 != null) {
            if (!L.contains(str)) {
                return f10.j(this.f35403f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = f10.f35416a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + f10.f35416a);
                    return null;
                }
                d[] dVarArr = (d[]) f10.k(this.f35403f);
                if (dVarArr != null && dVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) dVarArr[0].f35423a) / ((float) dVarArr[0].f35424b))), Integer.valueOf((int) (((float) dVarArr[1].f35423a) / ((float) dVarArr[1].f35424b))), Integer.valueOf((int) (((float) dVarArr[2].f35423a) / ((float) dVarArr[2].f35424b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr));
                return null;
            }
            try {
                return Double.toString(f10.h(this.f35403f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int e(String str, int i10) {
        b f10 = f(str);
        if (f10 == null) {
            return i10;
        }
        try {
            return f10.i(this.f35403f);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: p0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0471a extends InputStream implements DataInput {

        /* renamed from: e  reason: collision with root package name */
        private static final ByteOrder f35410e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        private static final ByteOrder f35411f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a  reason: collision with root package name */
        private DataInputStream f35412a;

        /* renamed from: b  reason: collision with root package name */
        private ByteOrder f35413b;

        /* renamed from: c  reason: collision with root package name */
        final int f35414c;

        /* renamed from: d  reason: collision with root package name */
        int f35415d;

        public C0471a(InputStream inputStream) throws IOException {
            this.f35413b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f35412a = dataInputStream;
            int available = dataInputStream.available();
            this.f35414c = available;
            this.f35415d = 0;
            this.f35412a.mark(available);
        }

        public int a() {
            return this.f35415d;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f35412a.available();
        }

        public long b() throws IOException {
            return readInt() & 4294967295L;
        }

        public void d(long j10) throws IOException {
            int i10 = this.f35415d;
            if (i10 > j10) {
                this.f35415d = 0;
                this.f35412a.reset();
                this.f35412a.mark(this.f35414c);
            } else {
                j10 -= i10;
            }
            int i11 = (int) j10;
            if (skipBytes(i11) != i11) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void e(ByteOrder byteOrder) {
            this.f35413b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f35415d++;
            return this.f35412a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f35415d++;
            return this.f35412a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i10 = this.f35415d + 1;
            this.f35415d = i10;
            if (i10 <= this.f35414c) {
                int read = this.f35412a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f35415d += 2;
            return this.f35412a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f35415d + i11;
            this.f35415d = i12;
            if (i12 <= this.f35414c) {
                if (this.f35412a.read(bArr, i10, i11) != i11) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i10 = this.f35415d + 4;
            this.f35415d = i10;
            if (i10 <= this.f35414c) {
                int read = this.f35412a.read();
                int read2 = this.f35412a.read();
                int read3 = this.f35412a.read();
                int read4 = this.f35412a.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f35413b;
                    if (byteOrder == f35410e) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f35411f) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f35413b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i10 = this.f35415d + 8;
            this.f35415d = i10;
            if (i10 <= this.f35414c) {
                int read = this.f35412a.read();
                int read2 = this.f35412a.read();
                int read3 = this.f35412a.read();
                int read4 = this.f35412a.read();
                int read5 = this.f35412a.read();
                int read6 = this.f35412a.read();
                int read7 = this.f35412a.read();
                int read8 = this.f35412a.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f35413b;
                    if (byteOrder == f35410e) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f35411f) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException("Invalid byte order: " + this.f35413b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i10 = this.f35415d + 2;
            this.f35415d = i10;
            if (i10 <= this.f35414c) {
                int read = this.f35412a.read();
                int read2 = this.f35412a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f35413b;
                    if (byteOrder == f35410e) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f35411f) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f35413b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f35415d += 2;
            return this.f35412a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f35415d++;
            return this.f35412a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i10 = this.f35415d + 2;
            this.f35415d = i10;
            if (i10 <= this.f35414c) {
                int read = this.f35412a.read();
                int read2 = this.f35412a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f35413b;
                    if (byteOrder == f35410e) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f35411f) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f35413b);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) throws IOException {
            int min = Math.min(i10, this.f35414c - this.f35415d);
            int i11 = 0;
            while (i11 < min) {
                i11 += this.f35412a.skipBytes(min - i11);
            }
            this.f35415d += i11;
            return i11;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int read = this.f35412a.read(bArr, i10, i11);
            this.f35415d += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f35415d + bArr.length;
            this.f35415d = length;
            if (length <= this.f35414c) {
                if (this.f35412a.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public C0471a(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExifInterface.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f35419a;

        /* renamed from: b  reason: collision with root package name */
        public final String f35420b;

        /* renamed from: c  reason: collision with root package name */
        public final int f35421c;

        /* renamed from: d  reason: collision with root package name */
        public final int f35422d;

        c(String str, int i10, int i11) {
            this.f35420b = str;
            this.f35419a = i10;
            this.f35421c = i11;
            this.f35422d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f35421c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f35422d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        c(String str, int i10, int i11, int i12) {
            this.f35420b = str;
            this.f35419a = i10;
            this.f35421c = i11;
            this.f35422d = i12;
        }
    }
}
