package mb;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import ib.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Ints.java */
/* loaded from: classes3.dex */
public final class d extends e {

    /* compiled from: Ints.java */
    /* loaded from: classes3.dex */
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final int[] f34419a;

        /* renamed from: b  reason: collision with root package name */
        final int f34420b;

        /* renamed from: c  reason: collision with root package name */
        final int f34421c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c */
        public Integer get(int i10) {
            l.h(i10, size());
            return Integer.valueOf(this.f34419a[this.f34420b + i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && d.i(this.f34419a, ((Integer) obj).intValue(), this.f34420b, this.f34421c) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Integer set(int i10, Integer num) {
            l.h(i10, size());
            int[] iArr = this.f34419a;
            int i11 = this.f34420b;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) l.j(num)).intValue();
            return Integer.valueOf(i12);
        }

        int[] e() {
            return Arrays.copyOfRange(this.f34419a, this.f34420b, this.f34421c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f34419a[this.f34420b + i10] != aVar.f34419a[aVar.f34420b + i10]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f34420b; i11 < this.f34421c; i11++) {
                i10 = (i10 * 31) + d.g(this.f34419a[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int i10;
            if (!(obj instanceof Integer) || (i10 = d.i(this.f34419a, ((Integer) obj).intValue(), this.f34420b, this.f34421c)) < 0) {
                return -1;
            }
            return i10 - this.f34420b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int j10;
            if (!(obj instanceof Integer) || (j10 = d.j(this.f34419a, ((Integer) obj).intValue(), this.f34420b, this.f34421c)) < 0) {
                return -1;
            }
            return j10 - this.f34420b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f34421c - this.f34420b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            l.n(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f34419a;
            int i12 = this.f34420b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f34419a[this.f34420b]);
            int i10 = this.f34420b;
            while (true) {
                i10++;
                if (i10 < this.f34421c) {
                    sb2.append(", ");
                    sb2.append(this.f34419a[i10]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        a(int[] iArr, int i10, int i11) {
            this.f34419a = iArr;
            this.f34420b = i10;
            this.f34421c = i11;
        }
    }

    public static List<Integer> c(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        l.g(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int e(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int f(int i10, int i11, int i12) {
        l.f(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int g(int i10) {
        return i10;
    }

    public static int h(int[] iArr, int i10) {
        return i(iArr, i10, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int k(long j10) {
        return j10 > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : j10 < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j10;
    }

    public static int[] l(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) l.j(array[i10])).intValue();
        }
        return iArr;
    }
}
