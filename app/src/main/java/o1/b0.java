package o1;

import android.net.Uri;
import android.os.Build;
import androidx.work.c;
import androidx.work.u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: WorkTypeConverters.kt */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f34870a = new b0();

    /* compiled from: WorkTypeConverters.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34871a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f34872b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f34873c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f34874d;

        static {
            int[] iArr = new int[u.a.values().length];
            iArr[u.a.ENQUEUED.ordinal()] = 1;
            iArr[u.a.RUNNING.ordinal()] = 2;
            iArr[u.a.SUCCEEDED.ordinal()] = 3;
            iArr[u.a.FAILED.ordinal()] = 4;
            iArr[u.a.BLOCKED.ordinal()] = 5;
            iArr[u.a.CANCELLED.ordinal()] = 6;
            f34871a = iArr;
            int[] iArr2 = new int[androidx.work.a.values().length];
            iArr2[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            iArr2[androidx.work.a.LINEAR.ordinal()] = 2;
            f34872b = iArr2;
            int[] iArr3 = new int[androidx.work.m.values().length];
            iArr3[androidx.work.m.NOT_REQUIRED.ordinal()] = 1;
            iArr3[androidx.work.m.CONNECTED.ordinal()] = 2;
            iArr3[androidx.work.m.UNMETERED.ordinal()] = 3;
            iArr3[androidx.work.m.NOT_ROAMING.ordinal()] = 4;
            iArr3[androidx.work.m.METERED.ordinal()] = 5;
            f34873c = iArr3;
            int[] iArr4 = new int[androidx.work.p.values().length];
            iArr4[androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            iArr4[androidx.work.p.DROP_WORK_REQUEST.ordinal()] = 2;
            f34874d = iArr4;
        }
    }

    private b0() {
    }

    public static final int a(androidx.work.a aVar) {
        qe.k.f(aVar, "backoffPolicy");
        int i10 = a.f34872b[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return 1;
            }
            throw new ee.l();
        }
        return 0;
    }

    public static final Set<c.C0082c> b(byte[] bArr) {
        ObjectInputStream objectInputStream;
        qe.k.f(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            try {
                int readInt = objectInputStream.readInt();
                for (int i10 = 0; i10 < readInt; i10++) {
                    Uri parse = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    qe.k.e(parse, "uri");
                    linkedHashSet.add(new c.C0082c(parse, readBoolean));
                }
                ee.u uVar = ee.u.f29813a;
                ne.a.a(objectInputStream, null);
                ee.u uVar2 = ee.u.f29813a;
                ne.a.a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ne.a.a(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    public static final androidx.work.a c(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return androidx.work.a.LINEAR;
            }
            throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
        }
        return androidx.work.a.EXPONENTIAL;
    }

    public static final androidx.work.m d(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
                                return androidx.work.m.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
                        }
                        return androidx.work.m.METERED;
                    }
                    return androidx.work.m.NOT_ROAMING;
                }
                return androidx.work.m.UNMETERED;
            }
            return androidx.work.m.CONNECTED;
        }
        return androidx.work.m.NOT_REQUIRED;
    }

    public static final androidx.work.p e(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return androidx.work.p.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
        }
        return androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static final u.a f(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return u.a.CANCELLED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i10 + " to State");
                        }
                        return u.a.BLOCKED;
                    }
                    return u.a.FAILED;
                }
                return u.a.SUCCEEDED;
            }
            return u.a.RUNNING;
        }
        return u.a.ENQUEUED;
    }

    public static final int g(androidx.work.m mVar) {
        qe.k.f(mVar, "networkType");
        int i10 = a.f34873c[mVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (Build.VERSION.SDK_INT < 30 || mVar != androidx.work.m.TEMPORARILY_UNMETERED) {
                                throw new IllegalArgumentException("Could not convert " + mVar + " to int");
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static final int h(androidx.work.p pVar) {
        qe.k.f(pVar, "policy");
        int i10 = a.f34874d[pVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return 1;
            }
            throw new ee.l();
        }
        return 0;
    }

    public static final byte[] i(Set<c.C0082c> set) {
        qe.k.f(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeInt(set.size());
            for (c.C0082c c0082c : set) {
                objectOutputStream.writeUTF(c0082c.a().toString());
                objectOutputStream.writeBoolean(c0082c.b());
            }
            ee.u uVar = ee.u.f29813a;
            ne.a.a(objectOutputStream, null);
            ne.a.a(byteArrayOutputStream, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            qe.k.e(byteArray, "outputStream.toByteArray()");
            return byteArray;
        } finally {
        }
    }

    public static final int j(u.a aVar) {
        qe.k.f(aVar, "state");
        switch (a.f34871a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new ee.l();
        }
    }
}
