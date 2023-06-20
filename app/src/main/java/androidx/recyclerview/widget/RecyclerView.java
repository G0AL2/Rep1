package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.q;
import com.google.android.gms.common.api.Api;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import i0.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements androidx.core.view.m {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    androidx.recyclerview.widget.l mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    h mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private k mChildDrawingOrderCallback;
    androidx.recyclerview.widget.b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.e mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private t mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private m.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<r> mOnChildAttachStateListeners;
    private s mOnFlingListener;
    private final ArrayList<t> mOnItemTouchListeners;
    final List<d0> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    e.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final w mRecycler;
    x mRecyclerListener;
    final List<x> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private u mScrollListener;
    private List<u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.n mScrollingChildHelper;
    final a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final c0 mViewFlinger;
    private final q.b mViewInfoProcessCallback;
    final androidx.recyclerview.widget.q mViewInfoStore;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a0 {

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f3526b;

        /* renamed from: m  reason: collision with root package name */
        int f3537m;

        /* renamed from: n  reason: collision with root package name */
        long f3538n;

        /* renamed from: o  reason: collision with root package name */
        int f3539o;

        /* renamed from: p  reason: collision with root package name */
        int f3540p;

        /* renamed from: a  reason: collision with root package name */
        int f3525a = -1;

        /* renamed from: c  reason: collision with root package name */
        int f3527c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f3528d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f3529e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f3530f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f3531g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f3532h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f3533i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f3534j = false;

        /* renamed from: k  reason: collision with root package name */
        boolean f3535k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f3536l = false;

        void a(int i10) {
            if ((this.f3529e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f3529e));
        }

        public int b() {
            if (this.f3532h) {
                return this.f3527c - this.f3528d;
            }
            return this.f3530f;
        }

        public int c() {
            return this.f3525a;
        }

        public boolean d() {
            return this.f3525a != -1;
        }

        public boolean e() {
            return this.f3532h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void f(h hVar) {
            this.f3529e = 1;
            this.f3530f = hVar.getItemCount();
            this.f3532h = false;
            this.f3533i = false;
            this.f3534j = false;
        }

        public boolean g() {
            return this.f3536l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3525a + ", mData=" + this.f3526b + ", mItemCount=" + this.f3530f + ", mIsMeasuring=" + this.f3534j + ", mPreviousLayoutItemCount=" + this.f3527c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3528d + ", mStructureChanged=" + this.f3531g + ", mInPreLayout=" + this.f3532h + ", mRunSimpleAnimations=" + this.f3535k + ", mRunPredictiveAnimations=" + this.f3536l + '}';
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.mItemAnimator;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b0 {
    }

    /* loaded from: classes.dex */
    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f3542a;

        /* renamed from: b  reason: collision with root package name */
        private int f3543b;

        /* renamed from: c  reason: collision with root package name */
        OverScroller f3544c;

        /* renamed from: d  reason: collision with root package name */
        Interpolator f3545d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3546e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3547f;

        c0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f3545d = interpolator;
            this.f3546e = false;
            this.f3547f = false;
            this.f3544c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            androidx.core.view.z.i0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f3543b = 0;
            this.f3542a = 0;
            Interpolator interpolator = this.f3545d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f3545d = interpolator2;
                this.f3544c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3544c.fling(0, 0, i10, i11, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            d();
        }

        void d() {
            if (this.f3546e) {
                this.f3547f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f3545d != interpolator) {
                this.f3545d = interpolator;
                this.f3544c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3543b = 0;
            this.f3542a = 0;
            RecyclerView.this.setScrollState(2);
            this.f3544c.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3544c.computeScrollOffset();
            }
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f3544c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                f();
                return;
            }
            this.f3547f = false;
            this.f3546e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f3544c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f3542a;
                int i13 = currY - this.f3543b;
                this.f3542a = currX;
                this.f3543b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i12, i13, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    i12 -= i11;
                    i13 -= i10;
                    z zVar = recyclerView4.mLayout.f3572g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int b10 = RecyclerView.this.mState.b();
                        if (b10 == 0) {
                            zVar.r();
                        } else if (zVar.f() >= b10) {
                            zVar.p(b10 - 1);
                            zVar.j(i11, i10);
                        } else {
                            zVar.j(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i11, i10, i12, i13, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.dispatchOnScrolled(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                z zVar2 = RecyclerView.this.mLayout.f3572g;
                if (!(zVar2 != null && zVar2.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i16, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.mGapWorker;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i11, i10);
                    }
                }
            }
            z zVar3 = RecyclerView.this.mLayout.f3572g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f3546e = false;
            if (this.f3547f) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* loaded from: classes.dex */
    class d implements q.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.q.b
        public void a(d0 d0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.animateAppearance(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void b(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.u1(d0Var.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void c(d0 d0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.mRecycler.J(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void d(d0 d0Var, m.c cVar, m.c cVar2) {
            d0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.b(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.d(d0Var, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h<? extends d0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        d0 mShadowedHolder = null;
        d0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public d0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && androidx.core.view.z.R(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends d0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !androidx.core.view.z.R(this.itemView);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f3592c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = androidx.core.view.z.A(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(w wVar, boolean z10) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z10;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.J(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements b.InterfaceC0068b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0068b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0068b
        public void addView(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0068b
        public int b() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0068b
        public void c(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0068b
        public d0 d(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0068b
        public void e(int i10) {
            d0 childViewHolderInt;
            View a10 = a(i10);
            if (a10 != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(a10)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0068b
        public void f() {
            int b10 = b();
            for (int i10 = 0; i10 < b10; i10++) {
                View a10 = a(i10);
                RecyclerView.this.dispatchChildDetached(a10);
                a10.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0068b
        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0068b
        public void h(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0068b
        public void i(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0068b
        public void j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0067a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0067a
        public void a(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForMove(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0067a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0067a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0067a
        public void d(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0067a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.viewRangeUpdate(i10, i11, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0067a
        public d0 f(int i10) {
            d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i10, true);
            if (findViewHolderForPosition == null || RecyclerView.this.mChildHelper.n(findViewHolderForPosition.itemView)) {
                return null;
            }
            return findViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0067a
        public void g(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForInsert(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0067a
        public void h(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f3528d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f3672a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.Y0(recyclerView, bVar.f3673b, bVar.f3675d);
            } else if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.b1(recyclerView2, bVar.f3673b, bVar.f3675d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.d1(recyclerView3, bVar.f3673b, bVar.f3675d, bVar.f3674c);
            } else if (i10 != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.a1(recyclerView4, bVar.f3673b, bVar.f3675d, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3552a;

        static {
            int[] iArr = new int[h.a.values().length];
            f3552a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3552a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h<VH extends d0> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        /* loaded from: classes.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i10) {
            boolean z10 = vh.mBindingAdapter == null;
            if (z10) {
                vh.mPosition = i10;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i10);
                }
                vh.setFlags(1, 519);
                e0.j.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i10, vh.getUnmodifiedPayloads());
            if (z10) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f3592c = true;
                }
                e0.j.b();
            }
        }

        boolean canRestoreState() {
            int i10 = g.f3552a[this.mStateRestorationPolicy.ordinal()];
            if (i10 != 1) {
                return i10 != 2 || getItemCount() > 0;
            }
            return false;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                e0.j.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i10;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                e0.j.b();
            }
        }

        public int findRelativeAdapterPositionIn(h<? extends d0> hVar, d0 d0Var, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i10);

        public void onBindViewHolder(VH vh, int i10, List<Object> list) {
            onBindViewHolder(vh, i10);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i10);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z10) {
            if (!hasObservers()) {
                this.mHasStableIds = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.e(i10, i11, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i10, i11);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i10, int i11) {
        }

        public void onItemRangeChanged(int i10, int i11, Object obj) {
            onItemRangeChanged(i10, i11);
        }

        public void onItemRangeInserted(int i10, int i11) {
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
        }

        public void onItemRangeRemoved(int i10, int i11) {
        }

        public void onStateRestorationPolicyChanged() {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        int a(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class l {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {

        /* renamed from: a  reason: collision with root package name */
        private b f3557a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<a> f3558b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private long f3559c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f3560d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f3561e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f3562f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface b {
            void a(d0 d0Var);
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f3563a;

            /* renamed from: b  reason: collision with root package name */
            public int f3564b;

            public c a(d0 d0Var) {
                return b(d0Var, 0);
            }

            public c b(d0 d0Var, int i10) {
                View view = d0Var.itemView;
                this.f3563a = view.getLeft();
                this.f3564b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i10 = d0Var.mFlags & 14;
            if (d0Var.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = d0Var.getOldPosition();
                int absoluteAdapterPosition = d0Var.getAbsoluteAdapterPosition();
                return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i10 : i10 | 2048;
            }
            return i10;
        }

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public abstract boolean b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public abstract boolean d(d0 d0Var, c cVar, c cVar2);

        public abstract boolean f(d0 d0Var);

        public boolean g(d0 d0Var, List<Object> list) {
            return f(d0Var);
        }

        public final void h(d0 d0Var) {
            r(d0Var);
            b bVar = this.f3557a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void i() {
            int size = this.f3558b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3558b.get(i10).a();
            }
            this.f3558b.clear();
        }

        public abstract void j(d0 d0Var);

        public abstract void k();

        public long l() {
            return this.f3559c;
        }

        public long m() {
            return this.f3562f;
        }

        public long n() {
            return this.f3561e;
        }

        public long o() {
            return this.f3560d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(d0 d0Var) {
        }

        public c s(a0 a0Var, d0 d0Var) {
            return q().a(d0Var);
        }

        public c t(a0 a0Var, d0 d0Var, int i10, List<Object> list) {
            return q().a(d0Var);
        }

        public abstract void u();

        void v(b bVar) {
            this.f3557a = bVar;
        }
    }

    /* loaded from: classes.dex */
    private class n implements m.b {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(d0 d0Var) {
            d0Var.setIsRecyclable(true);
            if (d0Var.mShadowedHolder != null && d0Var.mShadowingHolder == null) {
                d0Var.mShadowedHolder = null;
            }
            d0Var.mShadowingHolder = null;
            if (d0Var.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(d0Var.itemView) || !d0Var.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d0Var.itemView, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        @Deprecated
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            d(rect, ((q) view.getLayoutParams()).c(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            h(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class p {

        /* renamed from: a  reason: collision with root package name */
        androidx.recyclerview.widget.b f3566a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f3567b;

        /* renamed from: c  reason: collision with root package name */
        private final p.b f3568c;

        /* renamed from: d  reason: collision with root package name */
        private final p.b f3569d;

        /* renamed from: e  reason: collision with root package name */
        androidx.recyclerview.widget.p f3570e;

        /* renamed from: f  reason: collision with root package name */
        androidx.recyclerview.widget.p f3571f;

        /* renamed from: g  reason: collision with root package name */
        z f3572g;

        /* renamed from: h  reason: collision with root package name */
        boolean f3573h;

        /* renamed from: i  reason: collision with root package name */
        boolean f3574i;

        /* renamed from: j  reason: collision with root package name */
        boolean f3575j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f3576k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f3577l;

        /* renamed from: m  reason: collision with root package name */
        int f3578m;

        /* renamed from: n  reason: collision with root package name */
        boolean f3579n;

        /* renamed from: o  reason: collision with root package name */
        private int f3580o;

        /* renamed from: p  reason: collision with root package name */
        private int f3581p;

        /* renamed from: q  reason: collision with root package name */
        private int f3582q;

        /* renamed from: r  reason: collision with root package name */
        private int f3583r;

        /* loaded from: classes.dex */
        class a implements p.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i10) {
                return p.this.S(i10);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return p.this.a0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return p.this.u0() - p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return p.this.d0(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        class b implements p.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i10) {
                return p.this.S(i10);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return p.this.e0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return p.this.g0() - p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return p.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i10, int i11);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f3586a;

            /* renamed from: b  reason: collision with root package name */
            public int f3587b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f3588c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f3589d;
        }

        public p() {
            a aVar = new a();
            this.f3568c = aVar;
            b bVar = new b();
            this.f3569d = bVar;
            this.f3570e = new androidx.recyclerview.widget.p(aVar);
            this.f3571f = new androidx.recyclerview.widget.p(bVar);
            this.f3573h = false;
            this.f3574i = false;
            this.f3575j = false;
            this.f3576k = true;
            this.f3577l = true;
        }

        private static boolean D0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 <= 0 || i10 == i12) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i10;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i10;
                } else {
                    return true;
                }
            }
            return false;
        }

        private void D1(w wVar, int i10, View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.f3567b.mAdapter.hasStableIds()) {
                y1(i10);
                wVar.C(childViewHolderInt);
                return;
            }
            H(i10);
            wVar.D(view);
            this.f3567b.mViewInfoStore.k(childViewHolderInt);
        }

        private void I(int i10, View view) {
            this.f3566a.d(i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int U(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.U(int, int, int, int, boolean):int");
        }

        private int[] V(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int u02 = u0() - getPaddingRight();
            int g02 = g0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - paddingLeft;
            int min = Math.min(0, i10);
            int i11 = top - paddingTop;
            int min2 = Math.min(0, i11);
            int i12 = width - u02;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - g02);
            if (j0() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static d o0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w0.c.f38150a, i10, i11);
            dVar.f3586a = obtainStyledAttributes.getInt(w0.c.f38151b, 1);
            dVar.f3587b = obtainStyledAttributes.getInt(w0.c.f38161l, 1);
            dVar.f3588c = obtainStyledAttributes.getBoolean(w0.c.f38160k, false);
            dVar.f3589d = obtainStyledAttributes.getBoolean(w0.c.f38162m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private void p(View view, int i10, boolean z10) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z10 && !childViewHolderInt.isRemoved()) {
                this.f3567b.mViewInfoStore.p(childViewHolderInt);
            } else {
                this.f3567b.mViewInfoStore.b(childViewHolderInt);
            }
            q qVar = (q) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.f3567b) {
                    int m10 = this.f3566a.m(view);
                    if (i10 == -1) {
                        i10 = this.f3566a.g();
                    }
                    if (m10 == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3567b.indexOfChild(view) + this.f3567b.exceptionLabel());
                    } else if (m10 != i10) {
                        this.f3567b.mLayout.I0(m10, i10);
                    }
                } else {
                    this.f3566a.a(view, i10, false);
                    qVar.f3592c = true;
                    z zVar = this.f3572g;
                    if (zVar != null && zVar.h()) {
                        this.f3572g.k(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f3566a.c(view, i10, view.getLayoutParams(), false);
            }
            if (qVar.f3593d) {
                childViewHolderInt.itemView.invalidate();
                qVar.f3593d = false;
            }
        }

        public static int x(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        private boolean z0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int u02 = u0() - getPaddingRight();
            int g02 = g0() - getPaddingBottom();
            Rect rect = this.f3567b.mTempRect;
            Z(focusedChild, rect);
            return rect.left - i10 < u02 && rect.right - i10 > paddingLeft && rect.top - i11 < g02 && rect.bottom - i11 > paddingTop;
        }

        public int A(a0 a0Var) {
            return 0;
        }

        public final boolean A0() {
            return this.f3577l;
        }

        public boolean A1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] V = V(view, rect);
            int i10 = V[0];
            int i11 = V[1];
            if ((!z11 || z0(recyclerView, i10, i11)) && !(i10 == 0 && i11 == 0)) {
                if (z10) {
                    recyclerView.scrollBy(i10, i11);
                } else {
                    recyclerView.smoothScrollBy(i10, i11);
                }
                return true;
            }
            return false;
        }

        public int B(a0 a0Var) {
            return 0;
        }

        public boolean B0(w wVar, a0 a0Var) {
            return false;
        }

        public void B1() {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int C(a0 a0Var) {
            return 0;
        }

        public boolean C0() {
            return this.f3576k;
        }

        public void C1() {
            this.f3573h = true;
        }

        public int D(a0 a0Var) {
            return 0;
        }

        public int E(a0 a0Var) {
            return 0;
        }

        public boolean E0() {
            z zVar = this.f3572g;
            return zVar != null && zVar.h();
        }

        public int E1(int i10, w wVar, a0 a0Var) {
            return 0;
        }

        public int F(a0 a0Var) {
            return 0;
        }

        public boolean F0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f3570e.b(view, 24579) && this.f3571f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public void F1(int i10) {
        }

        public void G(w wVar) {
            for (int T = T() - 1; T >= 0; T--) {
                D1(wVar, T, S(T));
            }
        }

        public void G0(View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f3591b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public int G1(int i10, w wVar, a0 a0Var) {
            return 0;
        }

        public void H(int i10) {
            I(i10, S(i10));
        }

        public void H0(View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f3567b.getItemDecorInsetsForChild(view);
            int i12 = i10 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i13 = i11 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int U = U(u0(), v0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) qVar).width, u());
            int U2 = U(g0(), h0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, v());
            if (N1(view, U, U2, qVar)) {
                view.measure(U, U2);
            }
        }

        void H1(RecyclerView recyclerView) {
            I1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void I0(int i10, int i11) {
            View S = S(i10);
            if (S != null) {
                H(i10);
                r(S, i11);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f3567b.toString());
        }

        void I1(int i10, int i11) {
            this.f3582q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f3580o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f3582q = 0;
            }
            this.f3583r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3581p = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.f3583r = 0;
        }

        void J(RecyclerView recyclerView) {
            this.f3574i = true;
            N0(recyclerView);
        }

        public void J0(int i10) {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i10);
            }
        }

        public void J1(int i10, int i11) {
            this.f3567b.setMeasuredDimension(i10, i11);
        }

        void K(RecyclerView recyclerView, w wVar) {
            this.f3574i = false;
            P0(recyclerView, wVar);
        }

        public void K0(int i10) {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i10);
            }
        }

        public void K1(Rect rect, int i10, int i11) {
            J1(x(i10, rect.width() + getPaddingLeft() + getPaddingRight(), m0()), x(i11, rect.height() + getPaddingTop() + getPaddingBottom(), l0()));
        }

        public View L(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f3566a.n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public void L0(h hVar, h hVar2) {
        }

        void L1(int i10, int i11) {
            int T = T();
            if (T == 0) {
                this.f3567b.defaultOnMeasure(i10, i11);
                return;
            }
            int i12 = RecyclerView.UNDEFINED_DURATION;
            int i13 = RecyclerView.UNDEFINED_DURATION;
            int i14 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i15 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i16 = 0; i16 < T; i16++) {
                View S = S(i16);
                Rect rect = this.f3567b.mTempRect;
                Z(S, rect);
                int i17 = rect.left;
                if (i17 < i14) {
                    i14 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i15) {
                    i15 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i13) {
                    i13 = i20;
                }
            }
            this.f3567b.mTempRect.set(i14, i15, i12, i13);
            K1(this.f3567b.mTempRect, i10, i11);
        }

        public View M(int i10) {
            int T = T();
            for (int i11 = 0; i11 < T; i11++) {
                View S = S(i11);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(S);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i10 && !childViewHolderInt.shouldIgnore() && (this.f3567b.mState.e() || !childViewHolderInt.isRemoved())) {
                    return S;
                }
            }
            return null;
        }

        public boolean M0(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        void M1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f3567b = null;
                this.f3566a = null;
                this.f3582q = 0;
                this.f3583r = 0;
            } else {
                this.f3567b = recyclerView;
                this.f3566a = recyclerView.mChildHelper;
                this.f3582q = recyclerView.getWidth();
                this.f3583r = recyclerView.getHeight();
            }
            this.f3580o = 1073741824;
            this.f3581p = 1073741824;
        }

        public abstract q N();

        public void N0(RecyclerView recyclerView) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean N1(View view, int i10, int i11, q qVar) {
            return (!view.isLayoutRequested() && this.f3576k && D0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && D0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public q O(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        @Deprecated
        public void O0(RecyclerView recyclerView) {
        }

        boolean O1() {
            return false;
        }

        public q P(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new q(layoutParams);
        }

        public void P0(RecyclerView recyclerView, w wVar) {
            O0(recyclerView);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean P1(View view, int i10, int i11, q qVar) {
            return (this.f3576k && D0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && D0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int Q() {
            return -1;
        }

        public View Q0(View view, int i10, w wVar, a0 a0Var) {
            return null;
        }

        public void Q1(RecyclerView recyclerView, a0 a0Var, int i10) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int R(View view) {
            return ((q) view.getLayoutParams()).f3591b.bottom;
        }

        public void R0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3567b;
            S0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void R1(z zVar) {
            z zVar2 = this.f3572g;
            if (zVar2 != null && zVar != zVar2 && zVar2.h()) {
                this.f3572g.r();
            }
            this.f3572g = zVar;
            zVar.q(this.f3567b, this);
        }

        public View S(int i10) {
            androidx.recyclerview.widget.b bVar = this.f3566a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public void S0(w wVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f3567b.canScrollVertically(-1) && !this.f3567b.canScrollHorizontally(-1) && !this.f3567b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f3567b.mAdapter;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        void S1() {
            z zVar = this.f3572g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public int T() {
            androidx.recyclerview.widget.b bVar = this.f3566a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void T0(w wVar, a0 a0Var, i0.c cVar) {
            if (this.f3567b.canScrollVertically(-1) || this.f3567b.canScrollHorizontally(-1)) {
                cVar.a(Constants.BUFFER_SIZE);
                cVar.v0(true);
            }
            if (this.f3567b.canScrollVertically(1) || this.f3567b.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.v0(true);
            }
            cVar.c0(c.b.a(q0(wVar, a0Var), X(wVar, a0Var), B0(wVar, a0Var), r0(wVar, a0Var)));
        }

        public boolean T1() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void U0(i0.c cVar) {
            RecyclerView recyclerView = this.f3567b;
            T0(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void V0(View view, i0.c cVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.f3566a.n(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f3567b;
            W0(recyclerView.mRecycler, recyclerView.mState, view, cVar);
        }

        public boolean W() {
            RecyclerView recyclerView = this.f3567b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public void W0(w wVar, a0 a0Var, View view, i0.c cVar) {
        }

        public int X(w wVar, a0 a0Var) {
            return -1;
        }

        public View X0(View view, int i10) {
            return null;
        }

        public int Y(View view) {
            return view.getBottom() + R(view);
        }

        public void Y0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void Z(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public void Z0(RecyclerView recyclerView) {
        }

        public int a0(View view) {
            return view.getLeft() - k0(view);
        }

        public void a1(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int b0(View view) {
            Rect rect = ((q) view.getLayoutParams()).f3591b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void b1(RecyclerView recyclerView, int i10, int i11) {
        }

        public int c0(View view) {
            Rect rect = ((q) view.getLayoutParams()).f3591b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void c1(RecyclerView recyclerView, int i10, int i11) {
        }

        public int d0(View view) {
            return view.getRight() + p0(view);
        }

        public void d1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            c1(recyclerView, i10, i11);
        }

        public int e0(View view) {
            return view.getTop() - s0(view);
        }

        public void e1(w wVar, a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public View f0() {
            View focusedChild;
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3566a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void f1(a0 a0Var) {
        }

        public int g0() {
            return this.f3583r;
        }

        public void g1(w wVar, a0 a0Var, int i10, int i11) {
            this.f3567b.defaultOnMeasure(i10, i11);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView != null) {
                return androidx.core.view.z.G(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView != null) {
                return androidx.core.view.z.H(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int h0() {
            return this.f3581p;
        }

        @Deprecated
        public boolean h1(RecyclerView recyclerView, View view, View view2) {
            return E0() || recyclerView.isComputingLayout();
        }

        public int i0() {
            RecyclerView recyclerView = this.f3567b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public boolean i1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return h1(recyclerView, view, view2);
        }

        public int j0() {
            return androidx.core.view.z.C(this.f3567b);
        }

        public void j1(Parcelable parcelable) {
        }

        public int k0(View view) {
            return ((q) view.getLayoutParams()).f3591b.left;
        }

        public Parcelable k1() {
            return null;
        }

        public void l(View view) {
            m(view, -1);
        }

        public int l0() {
            return androidx.core.view.z.D(this.f3567b);
        }

        public void l1(int i10) {
        }

        public void m(View view, int i10) {
            p(view, i10, true);
        }

        public int m0() {
            return androidx.core.view.z.E(this.f3567b);
        }

        void m1(z zVar) {
            if (this.f3572g == zVar) {
                this.f3572g = null;
            }
        }

        public void n(View view) {
            o(view, -1);
        }

        public int n0(View view) {
            return ((q) view.getLayoutParams()).c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean n1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f3567b;
            return o1(recyclerView.mRecycler, recyclerView.mState, i10, bundle);
        }

        public void o(View view, int i10) {
            p(view, i10, false);
        }

        public boolean o1(w wVar, a0 a0Var, int i10, Bundle bundle) {
            int g02;
            int u02;
            int i11;
            int i12;
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                g02 = recyclerView.canScrollVertically(1) ? (g0() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f3567b.canScrollHorizontally(1)) {
                    u02 = (u0() - getPaddingLeft()) - getPaddingRight();
                    i11 = g02;
                    i12 = u02;
                }
                i11 = g02;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                g02 = recyclerView.canScrollVertically(-1) ? -((g0() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f3567b.canScrollHorizontally(-1)) {
                    u02 = -((u0() - getPaddingLeft()) - getPaddingRight());
                    i11 = g02;
                    i12 = u02;
                }
                i11 = g02;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f3567b.smoothScrollBy(i12, i11, null, RecyclerView.UNDEFINED_DURATION, true);
            return true;
        }

        public int p0(View view) {
            return ((q) view.getLayoutParams()).f3591b.right;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean p1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f3567b;
            return q1(recyclerView.mRecycler, recyclerView.mState, view, i10, bundle);
        }

        public void q(String str) {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public int q0(w wVar, a0 a0Var) {
            return -1;
        }

        public boolean q1(w wVar, a0 a0Var, View view, int i10, Bundle bundle) {
            return false;
        }

        public void r(View view, int i10) {
            s(view, i10, (q) view.getLayoutParams());
        }

        public int r0(w wVar, a0 a0Var) {
            return 0;
        }

        public void r1() {
            for (int T = T() - 1; T >= 0; T--) {
                this.f3566a.q(T);
            }
        }

        public void s(View view, int i10, q qVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.f3567b.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.f3567b.mViewInfoStore.p(childViewHolderInt);
            }
            this.f3566a.c(view, i10, qVar, childViewHolderInt.isRemoved());
        }

        public int s0(View view) {
            return ((q) view.getLayoutParams()).f3591b.top;
        }

        public void s1(w wVar) {
            for (int T = T() - 1; T >= 0; T--) {
                if (!RecyclerView.getChildViewHolderInt(S(T)).shouldIgnore()) {
                    v1(T, wVar);
                }
            }
        }

        public void t(View view, Rect rect) {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public void t0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f3591b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f3567b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f3567b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        void t1(w wVar) {
            int j10 = wVar.j();
            for (int i10 = j10 - 1; i10 >= 0; i10--) {
                View n10 = wVar.n(i10);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(n10);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f3567b.removeDetachedView(n10, false);
                    }
                    m mVar = this.f3567b.mItemAnimator;
                    if (mVar != null) {
                        mVar.j(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    wVar.y(n10);
                }
            }
            wVar.e();
            if (j10 > 0) {
                this.f3567b.invalidate();
            }
        }

        public boolean u() {
            return false;
        }

        public int u0() {
            return this.f3582q;
        }

        public void u1(View view, w wVar) {
            x1(view);
            wVar.B(view);
        }

        public boolean v() {
            return false;
        }

        public int v0() {
            return this.f3580o;
        }

        public void v1(int i10, w wVar) {
            View S = S(i10);
            y1(i10);
            wVar.B(S);
        }

        public boolean w(q qVar) {
            return qVar != null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean w0() {
            int T = T();
            for (int i10 = 0; i10 < T; i10++) {
                ViewGroup.LayoutParams layoutParams = S(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean w1(Runnable runnable) {
            RecyclerView recyclerView = this.f3567b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public boolean x0() {
            return this.f3574i;
        }

        public void x1(View view) {
            this.f3566a.p(view);
        }

        public void y(int i10, int i11, a0 a0Var, c cVar) {
        }

        public boolean y0() {
            return this.f3575j;
        }

        public void y1(int i10) {
            if (S(i10) != null) {
                this.f3566a.q(i10);
            }
        }

        public void z(int i10, c cVar) {
        }

        public boolean z1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return A1(recyclerView, view, rect, z10, false);
        }
    }

    /* loaded from: classes.dex */
    public interface r {
        void a(View view);

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class s {
        public abstract boolean a(int i10, int i11);
    }

    /* loaded from: classes.dex */
    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    /* loaded from: classes.dex */
    public static abstract class u {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public static class v {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f3594a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private int f3595b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<d0> f3596a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f3597b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f3598c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f3599d = 0;

            a() {
            }
        }

        private a g(int i10) {
            a aVar = this.f3594a.get(i10);
            if (aVar == null) {
                a aVar2 = new a();
                this.f3594a.put(i10, aVar2);
                return aVar2;
            }
            return aVar;
        }

        void a() {
            this.f3595b++;
        }

        public void b() {
            for (int i10 = 0; i10 < this.f3594a.size(); i10++) {
                this.f3594a.valueAt(i10).f3596a.clear();
            }
        }

        void c() {
            this.f3595b--;
        }

        void d(int i10, long j10) {
            a g10 = g(i10);
            g10.f3599d = j(g10.f3599d, j10);
        }

        void e(int i10, long j10) {
            a g10 = g(i10);
            g10.f3598c = j(g10.f3598c, j10);
        }

        public d0 f(int i10) {
            a aVar = this.f3594a.get(i10);
            if (aVar == null || aVar.f3596a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.f3596a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void h(h hVar, h hVar2, boolean z10) {
            if (hVar != null) {
                c();
            }
            if (!z10 && this.f3595b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int itemViewType = d0Var.getItemViewType();
            ArrayList<d0> arrayList = g(itemViewType).f3596a;
            if (this.f3594a.get(itemViewType).f3597b <= arrayList.size()) {
                return;
            }
            d0Var.resetInternal();
            arrayList.add(d0Var);
        }

        long j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean k(int i10, long j10, long j11) {
            long j12 = g(i10).f3599d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean l(int i10, long j10, long j11) {
            long j12 = g(i10).f3598c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* loaded from: classes.dex */
    public final class w {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<d0> f3600a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<d0> f3601b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<d0> f3602c;

        /* renamed from: d  reason: collision with root package name */
        private final List<d0> f3603d;

        /* renamed from: e  reason: collision with root package name */
        private int f3604e;

        /* renamed from: f  reason: collision with root package name */
        int f3605f;

        /* renamed from: g  reason: collision with root package name */
        v f3606g;

        public w() {
            ArrayList<d0> arrayList = new ArrayList<>();
            this.f3600a = arrayList;
            this.f3601b = null;
            this.f3602c = new ArrayList<>();
            this.f3603d = Collections.unmodifiableList(arrayList);
            this.f3604e = 2;
            this.f3605f = 2;
        }

        private boolean H(d0 d0Var, int i10, int i11, long j10) {
            d0Var.mBindingAdapter = null;
            d0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = d0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 == RecyclerView.FOREVER_NS || this.f3606g.k(itemViewType, nanoTime, j10)) {
                RecyclerView.this.mAdapter.bindViewHolder(d0Var, i10);
                this.f3606g.d(d0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
                b(d0Var);
                if (RecyclerView.this.mState.e()) {
                    d0Var.mPreLayoutPosition = i11;
                    return true;
                }
                return true;
            }
            return false;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.itemView;
                if (androidx.core.view.z.A(view) == 0) {
                    androidx.core.view.z.A0(view, 1);
                }
                androidx.recyclerview.widget.l lVar = RecyclerView.this.mAccessibilityDelegate;
                if (lVar == null) {
                    return;
                }
                androidx.core.view.a n10 = lVar.n();
                if (n10 instanceof l.a) {
                    ((l.a) n10).o(view);
                }
                androidx.core.view.z.q0(view, n10);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(d0 d0Var) {
            View view = d0Var.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i10) {
            a(this.f3602c.get(i10), true);
            this.f3602c.remove(i10);
        }

        public void B(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.j(childViewHolderInt);
        }

        void C(d0 d0Var) {
            boolean z10;
            boolean z11 = true;
            if (!d0Var.isScrap() && d0Var.itemView.getParent() == null) {
                if (!d0Var.isTmpDetached()) {
                    if (!d0Var.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = d0Var.doesTransientStatePreventRecycling();
                        h hVar = RecyclerView.this.mAdapter;
                        if ((hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(d0Var)) || d0Var.isRecyclable()) {
                            if (this.f3605f <= 0 || d0Var.hasAnyOfTheFlags(IronSourceError.ERROR_CAPPED_PER_SESSION)) {
                                z10 = false;
                            } else {
                                int size = this.f3602c.size();
                                if (size >= this.f3605f && size > 0) {
                                    A(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(d0Var.mPosition)) {
                                    int i10 = size - 1;
                                    while (i10 >= 0) {
                                        if (!RecyclerView.this.mPrefetchRegistry.d(this.f3602c.get(i10).mPosition)) {
                                            break;
                                        }
                                        i10--;
                                    }
                                    size = i10 + 1;
                                }
                                this.f3602c.add(size, d0Var);
                                z10 = true;
                            }
                            if (!z10) {
                                a(d0Var, true);
                                r1 = z10;
                                RecyclerView.this.mViewInfoStore.q(d0Var);
                                if (r1 && !z11 && doesTransientStatePreventRecycling) {
                                    d0Var.mBindingAdapter = null;
                                    d0Var.mOwnerRecyclerView = null;
                                    return;
                                }
                                return;
                            }
                            r1 = z10;
                        }
                        z11 = false;
                        RecyclerView.this.mViewInfoStore.q(d0Var);
                        if (r1) {
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.exceptionLabel());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(d0Var.isScrap());
            sb2.append(" isAttached:");
            sb2.append(d0Var.itemView.getParent() != null);
            sb2.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }

        void D(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f3601b == null) {
                    this.f3601b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f3601b.add(childViewHolderInt);
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                this.f3600a.add(childViewHolderInt);
            }
        }

        void E(v vVar) {
            v vVar2 = this.f3606g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.f3606g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f3606g.a();
        }

        void F(b0 b0Var) {
        }

        public void G(int i10) {
            this.f3604e = i10;
            K();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01d3 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 530
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        void J(d0 d0Var) {
            if (d0Var.mInChangeScrap) {
                this.f3601b.remove(d0Var);
            } else {
                this.f3600a.remove(d0Var);
            }
            d0Var.mScrapContainer = null;
            d0Var.mInChangeScrap = false;
            d0Var.clearReturnedFromScrapFlag();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void K() {
            p pVar = RecyclerView.this.mLayout;
            this.f3605f = this.f3604e + (pVar != null ? pVar.f3578m : 0);
            for (int size = this.f3602c.size() - 1; size >= 0 && this.f3602c.size() > this.f3605f; size--) {
                A(size);
            }
        }

        boolean L(d0 d0Var) {
            if (d0Var.isRemoved()) {
                return RecyclerView.this.mState.e();
            }
            int i10 = d0Var.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.mAdapter.getItemCount()) {
                if (RecyclerView.this.mState.e() || RecyclerView.this.mAdapter.getItemViewType(d0Var.mPosition) == d0Var.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.hasStableIds() || d0Var.getItemId() == RecyclerView.this.mAdapter.getItemId(d0Var.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.exceptionLabel());
        }

        void M(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f3602c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f3602c.get(size);
                if (d0Var != null && (i12 = d0Var.mPosition) >= i10 && i12 < i13) {
                    d0Var.addFlags(2);
                    A(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(d0 d0Var, boolean z10) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.itemView;
            androidx.recyclerview.widget.l lVar = RecyclerView.this.mAccessibilityDelegate;
            if (lVar != null) {
                androidx.core.view.a n10 = lVar.n();
                androidx.core.view.z.q0(view, n10 instanceof l.a ? ((l.a) n10).n(view) : null);
            }
            if (z10) {
                g(d0Var);
            }
            d0Var.mBindingAdapter = null;
            d0Var.mOwnerRecyclerView = null;
            i().i(d0Var);
        }

        public void c() {
            this.f3600a.clear();
            z();
        }

        void d() {
            int size = this.f3602c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3602c.get(i10).clearOldPosition();
            }
            int size2 = this.f3600a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f3600a.get(i11).clearOldPosition();
            }
            ArrayList<d0> arrayList = this.f3601b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f3601b.get(i12).clearOldPosition();
                }
            }
        }

        void e() {
            this.f3600a.clear();
            ArrayList<d0> arrayList = this.f3601b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.mState.b()) {
                return !RecyclerView.this.mState.e() ? i10 : RecyclerView.this.mAdapterHelper.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
        }

        void g(d0 d0Var) {
            x xVar = RecyclerView.this.mRecyclerListener;
            if (xVar != null) {
                xVar.a(d0Var);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.mRecyclerListeners.get(i10).a(d0Var);
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar != null) {
                hVar.onViewRecycled(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(d0Var);
            }
        }

        d0 h(int i10) {
            int size;
            int m10;
            ArrayList<d0> arrayList = this.f3601b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    d0 d0Var = this.f3601b.get(i11);
                    if (!d0Var.wasReturnedFromScrap() && d0Var.getLayoutPosition() == i10) {
                        d0Var.addFlags(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (m10 = RecyclerView.this.mAdapterHelper.m(i10)) > 0 && m10 < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(m10);
                    for (int i12 = 0; i12 < size; i12++) {
                        d0 d0Var2 = this.f3601b.get(i12);
                        if (!d0Var2.wasReturnedFromScrap() && d0Var2.getItemId() == itemId) {
                            d0Var2.addFlags(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.f3606g == null) {
                this.f3606g = new v();
            }
            return this.f3606g;
        }

        int j() {
            return this.f3600a.size();
        }

        public List<d0> k() {
            return this.f3603d;
        }

        d0 l(long j10, int i10, boolean z10) {
            for (int size = this.f3600a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f3600a.get(size);
                if (d0Var.getItemId() == j10 && !d0Var.wasReturnedFromScrap()) {
                    if (i10 == d0Var.getItemViewType()) {
                        d0Var.addFlags(32);
                        if (d0Var.isRemoved() && !RecyclerView.this.mState.e()) {
                            d0Var.setFlags(2, 14);
                        }
                        return d0Var;
                    } else if (!z10) {
                        this.f3600a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.itemView, false);
                        y(d0Var.itemView);
                    }
                }
            }
            int size2 = this.f3602c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = this.f3602c.get(size2);
                if (d0Var2.getItemId() == j10 && !d0Var2.isAttachedToTransitionOverlay()) {
                    if (i10 == d0Var2.getItemViewType()) {
                        if (!z10) {
                            this.f3602c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z10) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        d0 m(int i10, boolean z10) {
            View e10;
            int size = this.f3600a.size();
            for (int i11 = 0; i11 < size; i11++) {
                d0 d0Var = this.f3600a.get(i11);
                if (!d0Var.wasReturnedFromScrap() && d0Var.getLayoutPosition() == i10 && !d0Var.isInvalid() && (RecyclerView.this.mState.f3532h || !d0Var.isRemoved())) {
                    d0Var.addFlags(32);
                    return d0Var;
                }
            }
            if (!z10 && (e10 = RecyclerView.this.mChildHelper.e(i10)) != null) {
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e10);
                RecyclerView.this.mChildHelper.s(e10);
                int m10 = RecyclerView.this.mChildHelper.m(e10);
                if (m10 != -1) {
                    RecyclerView.this.mChildHelper.d(m10);
                    D(e10);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f3602c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                d0 d0Var2 = this.f3602c.get(i12);
                if (!d0Var2.isInvalid() && d0Var2.getLayoutPosition() == i10 && !d0Var2.isAttachedToTransitionOverlay()) {
                    if (!z10) {
                        this.f3602c.remove(i12);
                    }
                    return d0Var2;
                }
            }
            return null;
        }

        View n(int i10) {
            return this.f3600a.get(i10).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return I(i10, z10, RecyclerView.FOREVER_NS).itemView;
        }

        void s() {
            int size = this.f3602c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) this.f3602c.get(i10).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f3592c = true;
                }
            }
        }

        void t() {
            int size = this.f3602c.size();
            for (int i10 = 0; i10 < size; i10++) {
                d0 d0Var = this.f3602c.get(i10);
                if (d0Var != null) {
                    d0Var.addFlags(6);
                    d0Var.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar == null || !hVar.hasStableIds()) {
                z();
            }
        }

        void u(int i10, int i11) {
            int size = this.f3602c.size();
            for (int i12 = 0; i12 < size; i12++) {
                d0 d0Var = this.f3602c.get(i12);
                if (d0Var != null && d0Var.mPosition >= i10) {
                    d0Var.offsetPosition(i11, false);
                }
            }
        }

        void v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f3602c.size();
            for (int i16 = 0; i16 < size; i16++) {
                d0 d0Var = this.f3602c.get(i16);
                if (d0Var != null && (i15 = d0Var.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        d0Var.offsetPosition(i11 - i10, false);
                    } else {
                        d0Var.offsetPosition(i12, false);
                    }
                }
            }
        }

        void w(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f3602c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f3602c.get(size);
                if (d0Var != null) {
                    int i13 = d0Var.mPosition;
                    if (i13 >= i12) {
                        d0Var.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        d0Var.addFlags(8);
                        A(size);
                    }
                }
            }
        }

        void x(h hVar, h hVar2, boolean z10) {
            c();
            i().h(hVar, hVar2, z10);
        }

        void y(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            C(childViewHolderInt);
        }

        void z() {
            for (int size = this.f3602c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f3602c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface x {
        void a(d0 d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class y extends j {
        y() {
        }

        void a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    androidx.core.view.z.i0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f3531g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.r(i10, i11, obj)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeInserted(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.s(i10, i11)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeMoved(int i10, int i11, int i12) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.t(i10, i11, i12)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeRemoved(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.u(i10, i11)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onStateRestorationPolicyChanged() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (hVar = recyclerView.mAdapter) == null || !hVar.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class z {

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f3610b;

        /* renamed from: c  reason: collision with root package name */
        private p f3611c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3612d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3613e;

        /* renamed from: f  reason: collision with root package name */
        private View f3614f;

        /* renamed from: h  reason: collision with root package name */
        private boolean f3616h;

        /* renamed from: a  reason: collision with root package name */
        private int f3609a = -1;

        /* renamed from: g  reason: collision with root package name */
        private final a f3615g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f3617a;

            /* renamed from: b  reason: collision with root package name */
            private int f3618b;

            /* renamed from: c  reason: collision with root package name */
            private int f3619c;

            /* renamed from: d  reason: collision with root package name */
            private int f3620d;

            /* renamed from: e  reason: collision with root package name */
            private Interpolator f3621e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f3622f;

            /* renamed from: g  reason: collision with root package name */
            private int f3623g;

            public a(int i10, int i11) {
                this(i10, i11, RecyclerView.UNDEFINED_DURATION, null);
            }

            private void e() {
                if (this.f3621e != null && this.f3619c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f3619c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f3620d >= 0;
            }

            public void b(int i10) {
                this.f3620d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f3620d;
                if (i10 >= 0) {
                    this.f3620d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i10);
                    this.f3622f = false;
                } else if (this.f3622f) {
                    e();
                    recyclerView.mViewFlinger.e(this.f3617a, this.f3618b, this.f3619c, this.f3621e);
                    int i11 = this.f3623g + 1;
                    this.f3623g = i11;
                    if (i11 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3622f = false;
                } else {
                    this.f3623g = 0;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3617a = i10;
                this.f3618b = i11;
                this.f3619c = i12;
                this.f3621e = interpolator;
                this.f3622f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3620d = -1;
                this.f3622f = false;
                this.f3623g = 0;
                this.f3617a = i10;
                this.f3618b = i11;
                this.f3619c = i12;
                this.f3621e = interpolator;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            p e10 = e();
            if (e10 instanceof b) {
                return ((b) e10).a(i10);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f3610b.mLayout.M(i10);
        }

        public int c() {
            return this.f3610b.mLayout.T();
        }

        public int d(View view) {
            return this.f3610b.getChildLayoutPosition(view);
        }

        public p e() {
            return this.f3611c;
        }

        public int f() {
            return this.f3609a;
        }

        public boolean g() {
            return this.f3612d;
        }

        public boolean h() {
            return this.f3613e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void j(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f3610b;
            if (this.f3609a == -1 || recyclerView == null) {
                r();
            }
            if (this.f3612d && this.f3614f == null && this.f3611c != null && (a10 = a(this.f3609a)) != null) {
                float f10 = a10.x;
                if (f10 != 0.0f || a10.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(a10.y), null);
                }
            }
            this.f3612d = false;
            View view = this.f3614f;
            if (view != null) {
                if (d(view) == this.f3609a) {
                    o(this.f3614f, recyclerView.mState, this.f3615g);
                    this.f3615g.c(recyclerView);
                    r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f3614f = null;
                }
            }
            if (this.f3613e) {
                l(i10, i11, recyclerView.mState, this.f3615g);
                boolean a11 = this.f3615g.a();
                this.f3615g.c(recyclerView);
                if (a11 && this.f3613e) {
                    this.f3612d = true;
                    recyclerView.mViewFlinger.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f3614f = view;
            }
        }

        protected abstract void l(int i10, int i11, a0 a0Var, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i10) {
            this.f3609a = i10;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.mViewFlinger.f();
            if (this.f3616h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3610b = recyclerView;
            this.f3611c = pVar;
            int i10 = this.f3609a;
            if (i10 != -1) {
                recyclerView.mState.f3525a = i10;
                this.f3613e = true;
                this.f3612d = true;
                this.f3614f = b(f());
                m();
                this.f3610b.mViewFlinger.d();
                this.f3616h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void r() {
            if (this.f3613e) {
                this.f3613e = false;
                n();
                this.f3610b.mState.f3525a = -1;
                this.f3614f = null;
                this.f3609a = -1;
                this.f3612d = false;
                this.f3611c.m1(this);
                this.f3611c = null;
                this.f3610b = null;
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i10 == 18 || i10 == 19 || i10 == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i10 >= 23;
        POST_UPDATES_ON_ANIMATION = i10 >= 16;
        ALLOW_THREAD_GAP_WORK = i10 >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = i10 <= 15;
        IGNORE_DETACHED_FOCUSED_CHILD = i10 <= 15;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(d0 d0Var) {
        View view = d0Var.itemView;
        boolean z10 = view.getParent() == this;
        this.mRecycler.J(getChildViewHolder(view));
        if (d0Var.isTmpDetached()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.mChildHelper.b(view, true);
        } else {
            this.mChildHelper.k(view);
        }
    }

    private void animateChange(d0 d0Var, d0 d0Var2, m.c cVar, m.c cVar2, boolean z10, boolean z11) {
        d0Var.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z11) {
                addAnimatingView(d0Var2);
            }
            d0Var.mShadowedHolder = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.J(d0Var);
            d0Var2.setIsRecyclable(false);
            d0Var2.mShadowingHolder = d0Var;
        }
        if (this.mItemAnimator.b(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == d0Var.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            d0Var.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(p.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        i0.b.b(obtain, i10);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        boolean z10 = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f3534j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        a0 a0Var = this.mState;
        a0Var.f3533i = (a0Var.f3535k && this.mItemsChanged) ? false : false;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0Var.f3532h = a0Var.f3536l;
        a0Var.f3530f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f3535k) {
            int g10 = this.mChildHelper.g();
            for (int i10 = 0; i10 < g10; i10++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.t(this.mState, childViewHolderInt, m.e(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f3533i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f3536l) {
            saveOldPositions();
            a0 a0Var2 = this.mState;
            boolean z11 = a0Var2.f3531g;
            a0Var2.f3531g = false;
            this.mLayout.e1(this.mRecycler, a0Var2);
            this.mState.f3531g = z11;
            for (int i11 = 0; i11 < this.mChildHelper.g(); i11++) {
                d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i11));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int e10 = m.e(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(Constants.BUFFER_SIZE);
                    if (!hasAnyOfTheFlags) {
                        e10 |= 4096;
                    }
                    m.c t10 = this.mItemAnimator.t(this.mState, childViewHolderInt2, e10, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, t10);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, t10);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f3529e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.j();
        this.mState.f3530f = this.mAdapter.getItemCount();
        this.mState.f3528d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f3523c;
            if (parcelable != null) {
                this.mLayout.j1(parcelable);
            }
            this.mPendingSavedState = null;
        }
        a0 a0Var = this.mState;
        a0Var.f3532h = false;
        this.mLayout.e1(this.mRecycler, a0Var);
        a0 a0Var2 = this.mState;
        a0Var2.f3531g = false;
        a0Var2.f3535k = a0Var2.f3535k && this.mItemAnimator != null;
        a0Var2.f3529e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a0 a0Var = this.mState;
        a0Var.f3529e = 1;
        if (a0Var.f3535k) {
            for (int g10 = this.mChildHelper.g() - 1; g10 >= 0; g10--) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(g10));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    m.c s10 = this.mItemAnimator.s(this.mState, childViewHolderInt);
                    d0 g11 = this.mViewInfoStore.g(changedHolderKey);
                    if (g11 != null && !g11.shouldIgnore()) {
                        boolean h10 = this.mViewInfoStore.h(g11);
                        boolean h11 = this.mViewInfoStore.h(childViewHolderInt);
                        if (h10 && g11 == childViewHolderInt) {
                            this.mViewInfoStore.d(childViewHolderInt, s10);
                        } else {
                            m.c n10 = this.mViewInfoStore.n(g11);
                            this.mViewInfoStore.d(childViewHolderInt, s10);
                            m.c m10 = this.mViewInfoStore.m(childViewHolderInt);
                            if (n10 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g11);
                            } else {
                                animateChange(g11, childViewHolderInt, n10, m10, h10, h11);
                            }
                        }
                    } else {
                        this.mViewInfoStore.d(childViewHolderInt, s10);
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.t1(this.mRecycler);
        a0 a0Var2 = this.mState;
        a0Var2.f3527c = a0Var2.f3530f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.f3535k = false;
        a0Var2.f3536l = false;
        this.mLayout.f3573h = false;
        ArrayList<d0> arrayList = this.mRecycler.f3601b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.mLayout;
        if (pVar.f3579n) {
            pVar.f3578m = 0;
            pVar.f3579n = false;
            this.mRecycler.K();
        }
        this.mLayout.f1(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        t tVar = this.mInterceptingOnItemTouchListener;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = this.mOnItemTouchListeners.get(i10);
            if (tVar.b(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = tVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g10 = this.mChildHelper.g();
        if (g10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i11 = UNDEFINED_DURATION;
        for (int i12 = 0; i12 < g10; i12++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
                if (findNestedRecyclerView != null) {
                    return findNestedRecyclerView;
                }
            }
            return null;
        }
        return null;
    }

    private View findNextViewToFocus() {
        d0 findViewHolderForAdapterPosition;
        a0 a0Var = this.mState;
        int i10 = a0Var.f3537m;
        if (i10 == -1) {
            i10 = 0;
        }
        int b10 = a0Var.b();
        for (int i11 = i10; i11 < b10; i11++) {
            d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b10, i10);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f3590a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f3591b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private androidx.core.view.n getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new androidx.core.view.n(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j10, d0 d0Var, d0 d0Var2) {
        int g10 = this.mChildHelper.g();
        for (int i10 = 0; i10 < g10; i10++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j10) {
                h hVar = this.mAdapter;
                if (hVar != null && hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int g10 = this.mChildHelper.g();
        for (int i10 = 0; i10 < g10; i10++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (androidx.core.view.z.B(this) == 0) {
            androidx.core.view.z.B0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.b(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c10 = 65535;
        int i12 = this.mLayout.j0() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i13 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        } else if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        } else if (i10 == 17) {
            return i11 < 0;
        } else if (i10 == 33) {
            return c10 < 0;
        } else if (i10 == 66) {
            return i11 > 0;
        } else if (i10 == 130) {
            return c10 > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i10 + exceptionLabel());
        }
    }

    private void nestedScrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u10 = pVar.u();
            boolean v10 = this.mLayout.v();
            startNestedScroll(v10 ? u10 | 2 : u10, i12);
            if (dispatchNestedPreScroll(u10 != 0 ? i10 : 0, v10 ? i11 : 0, this.mReusableIntPair, this.mScrollOffset, i12)) {
                int[] iArr2 = this.mReusableIntPair;
                i10 -= iArr2[0];
                i11 -= iArr2[1];
            }
            scrollByInternal(u10 != 0 ? i10 : 0, v10 ? i11 : 0, motionEvent, i12);
            androidx.recyclerview.widget.e eVar = this.mGapWorker;
            if (eVar != null && (i10 != 0 || i11 != 0)) {
                eVar.f(this, i10, i11);
            }
            stopNestedScroll(i12);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.T1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.Z0(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.w();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z11 = false;
        boolean z12 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f3535k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z10 = this.mDataSetHasChangedAfterLayout) || z12 || this.mLayout.f3573h) && (!z10 || this.mAdapter.hasStableIds());
        a0 a0Var = this.mState;
        if (a0Var.f3535k && z12 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z11 = true;
        }
        a0Var.f3536l = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.e.c(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.e.c(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.e.c(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.e.c(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.z.h0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.mChildHelper.g() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.mChildHelper.n(focusedChild)) {
                return;
            }
        }
        View view = null;
        d0 findViewHolderForItemId = (this.mState.f3538n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f3538n);
        if (findViewHolderForItemId != null && !this.mChildHelper.n(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
            view = findViewHolderForItemId.itemView;
        } else if (this.mChildHelper.g() > 0) {
            view = findNextViewToFocus();
        }
        if (view != null) {
            int i10 = this.mState.f3539o;
            if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.mLeftGlow.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            androidx.core.view.z.h0(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f3592c) {
                Rect rect = qVar.f3591b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.A1(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        a0 a0Var = this.mState;
        a0Var.f3538n = -1L;
        a0Var.f3537m = -1;
        a0Var.f3539o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        d0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f3538n = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        a0 a0Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
        }
        a0Var.f3537m = absoluteAdapterPosition;
        this.mState.f3539o = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void setAdapterInternal(h hVar, boolean z10, boolean z11) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.y();
        h hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.mObserver);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.L0(hVar3, this.mAdapter);
        }
        this.mRecycler.x(hVar3, this.mAdapter, z10);
        this.mState.f3531g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.f();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.S1();
        }
    }

    void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        androidx.core.view.z.h0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.M0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void addItemDecoration(o oVar, int i10) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.q("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(oVar);
        } else {
            this.mItemDecorations.add(i10, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(uVar);
    }

    public void addRecyclerListener(x xVar) {
        h0.g.a(xVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(xVar);
    }

    void animateAppearance(d0 d0Var, m.c cVar, m.c cVar2) {
        d0Var.setIsRecyclable(false);
        if (this.mItemAnimator.a(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(d0 d0Var, m.c cVar, m.c cVar2) {
        addAnimatingView(d0Var);
        d0Var.setIsRecyclable(false);
        if (this.mItemAnimator.c(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(d0 d0Var) {
        m mVar = this.mItemAnimator;
        return mVar == null || mVar.g(d0Var, d0Var.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.mLayout.w((q) layoutParams);
    }

    void clearOldPositions() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.u()) {
            return this.mLayout.A(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.u()) {
            return this.mLayout.B(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.u()) {
            return this.mLayout.C(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.v()) {
            return this.mLayout.D(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.v()) {
            return this.mLayout.E(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.v()) {
            return this.mLayout.F(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.mLeftGlow.onRelease();
            z10 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            androidx.core.view.z.h0(this);
        }
    }

    void consumePendingUpdateOperations() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (this.mAdapterHelper.p()) {
                if (this.mAdapterHelper.o(4) && !this.mAdapterHelper.o(11)) {
                    e0.j.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.w();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.i();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    e0.j.b();
                    return;
                } else if (this.mAdapterHelper.p()) {
                    e0.j.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    e0.j.b();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        e0.j.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        e0.j.b();
    }

    void defaultOnMeasure(int i10, int i11) {
        setMeasuredDimension(p.x(i10, getPaddingLeft() + getPaddingRight(), androidx.core.view.z.E(this)), p.x(i11, getPaddingTop() + getPaddingBottom(), androidx.core.view.z.D(this)));
    }

    void dispatchChildAttached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            this.mState.f3534j = false;
            boolean z10 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
            this.mLastAutoMeasureNonExactMeasuredWidth = 0;
            this.mLastAutoMeasureNonExactMeasuredHeight = 0;
            this.mLastAutoMeasureSkippedDueToExact = false;
            if (this.mState.f3529e == 1) {
                dispatchLayoutStep1();
                this.mLayout.H1(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.q() && !z10 && this.mLayout.u0() == getWidth() && this.mLayout.g0() == getHeight()) {
                this.mLayout.H1(this);
            } else {
                this.mLayout.H1(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    void dispatchOnScrollStateChanged(int i10) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.l1(i10);
        }
        onScrollStateChanged(i10);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.a(this, i10);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i10);
            }
        }
    }

    void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.b(this, i10, i11);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.itemView.getParent() == this && !d0Var.shouldIgnore() && (i10 = d0Var.mPendingAccessibilityState) != -1) {
                androidx.core.view.z.A0(d0Var.itemView, i10);
                d0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).i(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.p()) {
            z12 = z10;
        }
        if (z12) {
            androidx.core.view.z.h0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = a10;
        if (this.mClipToPadding) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = a10;
        if (this.mClipToPadding) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = a10;
        if (this.mClipToPadding) {
            a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a10.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect a10 = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = a10;
        if (this.mClipToPadding) {
            a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a10.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f3544c;
            a0Var.f3540p = overScroller.getFinalX() - overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        a0Var.f3540p = 0;
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int g10 = this.mChildHelper.g() - 1; g10 >= 0; g10--) {
            View f12 = this.mChildHelper.f(g10);
            float translationX = f12.getTranslationX();
            float translationY = f12.getTranslationY();
            if (f10 >= f12.getLeft() + translationX && f10 <= f12.getRight() + translationX && f11 >= f12.getTop() + translationY && f11 <= f12.getBottom() + translationY) {
                return f12;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public d0 findViewHolderForAdapterPosition(int i10) {
        d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j10 = this.mChildHelper.j();
        for (int i11 = 0; i11 < j10; i11++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i10) {
                if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForItemId(long j10) {
        h hVar = this.mAdapter;
        d0 d0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j11 = this.mChildHelper.j();
            for (int i10 = 0; i10 < j11; i10++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Deprecated
    public d0 findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            int u10 = pVar.u();
            boolean v10 = this.mLayout.v();
            i10 = (u10 == 0 || Math.abs(i10) < this.mMinFlingVelocity) ? 0 : 0;
            i11 = (!v10 || Math.abs(i11) < this.mMinFlingVelocity) ? 0 : 0;
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            float f10 = i10;
            float f11 = i11;
            if (!dispatchNestedPreFling(f10, f11)) {
                boolean z10 = u10 != 0 || v10;
                dispatchNestedFling(f10, f11, z10);
                s sVar = this.mOnFlingListener;
                if (sVar != null && sVar.a(i10, i11)) {
                    return true;
                }
                if (z10) {
                    if (v10) {
                        u10 = (u10 == true ? 1 : 0) | 2;
                    }
                    startNestedScroll(u10, 1);
                    int i12 = this.mMaxFlingVelocity;
                    int max = Math.max(-i12, Math.min(i10, i12));
                    int i13 = this.mMaxFlingVelocity;
                    this.mViewFlinger.b(max, Math.max(-i13, Math.min(i11, i13)));
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View view2;
        boolean z10;
        View X0 = this.mLayout.X0(view, i10);
        if (X0 != null) {
            return X0;
        }
        boolean z11 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.mLayout.v()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.mLayout.u()) {
                int i12 = (this.mLayout.j0() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.Q0(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.Q0(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i10) ? view2 : super.focusSearch(view, i10);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.N();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.O(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(d0 d0Var) {
        if (d0Var.hasAnyOfTheFlags(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT) || !d0Var.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.e(d0Var.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.Q();
        }
        return super.getBaseline();
    }

    long getChangedHolderKey(d0 d0Var) {
        return this.mAdapter.hasStableIds() ? d0Var.getItemId() : d0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        k kVar = this.mChildDrawingOrderCallback;
        if (kVar == null) {
            return super.getChildDrawingOrder(i10, i11);
        }
        return kVar.a(i10, i11);
    }

    public long getChildItemId(View view) {
        d0 childViewHolderInt;
        h hVar = this.mAdapter;
        if (hVar == null || !hVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.l getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f3592c) {
            return qVar.f3591b;
        }
        if (this.mState.e() && (qVar.e() || qVar.g())) {
            return qVar.f3591b;
        }
        Rect rect = qVar.f3591b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i10).e(this.mTempRect, view, this, this.mState);
            int i11 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f3592c = false;
        return rect;
    }

    public o getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public v getRecycledViewPool() {
        return this.mRecycler.i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.p();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(w0.b.f38147a), resources.getDimensionPixelSize(w0.b.f38149c), resources.getDimensionPixelOffset(w0.b.f38148b));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.q("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        return mVar != null && mVar.p();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, androidx.core.view.m
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    void jumpToPositionForSmoothScroller(int i10) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.F1(i10);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            ((q) this.mChildHelper.i(i10).getLayoutParams()).f3592c = true;
        }
        this.mRecycler.s();
    }

    void markKnownViewsInvalid() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.t();
    }

    public void nestedScrollBy(int i10, int i11) {
        nestedScrollByInternal(i10, i11, null, 1);
    }

    public void offsetChildrenHorizontal(int i10) {
        int g10 = this.mChildHelper.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.mChildHelper.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int g10 = this.mChildHelper.g();
        for (int i11 = 0; i11 < g10; i11++) {
            this.mChildHelper.f(i11).offsetTopAndBottom(i10);
        }
    }

    void offsetPositionRecordsForInsert(int i10, int i11) {
        int j10 = this.mChildHelper.j();
        for (int i12 = 0; i12 < j10; i12++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f3531g = true;
            }
        }
        this.mRecycler.u(i10, i11);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int j10 = this.mChildHelper.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < j10; i16++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i16));
            if (childViewHolderInt != null && (i15 = childViewHolderInt.mPosition) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f3531g = true;
            }
        }
        this.mRecycler.v(i10, i11);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int j10 = this.mChildHelper.j();
        for (int i13 = 0; i13 < j10; i13++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    childViewHolderInt.offsetPosition(-i11, z10);
                    this.mState.f3531g = true;
                } else if (i14 >= i10) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.mState.f3531g = true;
                }
            }
        }
        this.mRecycler.w(i10, i11, z10);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z10 = true;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = (!this.mFirstLayoutComplete || isLayoutRequested()) ? false : false;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.J(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.e> threadLocal = androidx.recyclerview.widget.e.f3763e;
            androidx.recyclerview.widget.e eVar = threadLocal.get();
            this.mGapWorker = eVar;
            if (eVar == null) {
                this.mGapWorker = new androidx.recyclerview.widget.e();
                Display v10 = androidx.core.view.z.v(this);
                float f10 = 60.0f;
                if (!isInEditMode() && v10 != null) {
                    float refreshRate = v10.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.e eVar2 = this.mGapWorker;
                eVar2.f3767c = 1.0E9f / f10;
                threadLocal.set(eVar2);
            }
            this.mGapWorker.a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.k();
        }
        stopScroll();
        this.mIsAttached = false;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.K(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        if (!ALLOW_THREAD_GAP_WORK || (eVar = this.mGapWorker) == null) {
            return;
        }
        eVar.j(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).g(canvas, this, this.mState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            boolean r0 = r0.v()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.u()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.v()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.u()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6a:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean u10 = pVar.u();
        boolean v10 = this.mLayout.v();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = u10;
            if (v10) {
                i10 = (u10 ? 1 : 0) | 2;
            }
            startNestedScroll(i10, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i11 = x11 - this.mInitialTouchX;
                int i12 = y11 - this.mInitialTouchY;
                if (!u10 || Math.abs(i11) <= this.mTouchSlop) {
                    z10 = false;
                } else {
                    this.mLastTouchX = x11;
                    z10 = true;
                }
                if (v10 && Math.abs(i12) > this.mTouchSlop) {
                    this.mLastTouchY = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        e0.j.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        e0.j.b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.y0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.g1(this.mRecycler, this.mState, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z10;
            if (z10 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f3529e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.I1(i10, i11);
            this.mState.f3534j = true;
            dispatchLayoutStep2();
            this.mLayout.L1(i10, i11);
            if (this.mLayout.O1()) {
                this.mLayout.I1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f3534j = true;
                dispatchLayoutStep2();
                this.mLayout.L1(i10, i11);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
        } else if (this.mHasFixedSize) {
            this.mLayout.g1(this.mRecycler, this.mState, i10, i11);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                a0 a0Var = this.mState;
                if (a0Var.f3536l) {
                    a0Var.f3532h = true;
                } else {
                    this.mAdapterHelper.j();
                    this.mState.f3532h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f3536l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            h hVar = this.mAdapter;
            if (hVar != null) {
                this.mState.f3530f = hVar.getItemCount();
            } else {
                this.mState.f3530f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.g1(this.mRecycler, this.mState, i10, i11);
            stopInterceptRequestLayout(false);
            this.mState.f3532h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.c());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.e(savedState2);
        } else {
            p pVar = this.mLayout;
            if (pVar != null) {
                savedState.f3523c = pVar.k1();
            } else {
                savedState.f3523c = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i10) {
    }

    public void onScrolled(int i10, int i11) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        androidx.core.view.z.i0(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(d0 d0Var, m.c cVar) {
        d0Var.setFlags(0, Constants.BUFFER_SIZE);
        if (this.mState.f3533i && d0Var.isUpdated() && !d0Var.isRemoved() && !d0Var.shouldIgnore()) {
            this.mViewInfoStore.c(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.e(d0Var, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.s1(this.mRecycler);
            this.mLayout.t1(this.mRecycler);
        }
        this.mRecycler.c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r10 = this.mChildHelper.r(view);
        if (r10) {
            d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.J(childViewHolderInt);
            this.mRecycler.C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!r10);
        return r10;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(o oVar) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.q("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(r rVar) {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.remove(tVar);
        if (this.mInterceptingOnItemTouchListener == tVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void removeRecyclerListener(x xVar) {
        this.mRecyclerListeners.remove(xVar);
    }

    void repositionShadowingViews() {
        d0 d0Var;
        int g10 = this.mChildHelper.g();
        for (int i10 = 0; i10 < g10; i10++) {
            View f10 = this.mChildHelper.f(i10);
            d0 childViewHolder = getChildViewHolder(f10);
            if (childViewHolder != null && (d0Var = childViewHolder.mShadowingHolder) != null) {
                View view = d0Var.itemView;
                int left = f10.getLeft();
                int top = f10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.i1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.z1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mOnItemTouchListeners.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    void saveOldPositions() {
        int j10 = this.mChildHelper.j();
        for (int i10 = 0; i10 < j10; i10++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            boolean u10 = pVar.u();
            boolean v10 = this.mLayout.v();
            if (u10 || v10) {
                if (!u10) {
                    i10 = 0;
                }
                if (!v10) {
                    i11 = 0;
                }
                scrollByInternal(i10, i11, null, 0);
            }
        }
    }

    boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i10, i11, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i14, i13, i15, i16, this.mScrollOffset, i12, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i19 = i15 - iArr4[0];
        int i20 = i16 - iArr4[1];
        boolean z10 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i21 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i21 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.l.a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i19, motionEvent.getY(), i20);
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (i14 != 0 || i13 != 0) {
            dispatchOnScrolled(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i14 == 0 && i13 == 0) ? false : true;
    }

    void scrollStep(int i10, int i11, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        e0.j.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int E1 = i10 != 0 ? this.mLayout.E1(i10, this.mRecycler, this.mState) : 0;
        int G1 = i11 != 0 ? this.mLayout.G1(i11, this.mRecycler, this.mState) : 0;
        e0.j.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = E1;
            iArr[1] = G1;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        pVar.F1(i10);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.l lVar) {
        this.mAccessibilityDelegate = lVar;
        androidx.core.view.z.q0(this, lVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    boolean setChildImportantForAccessibilityInternal(d0 d0Var, int i10) {
        if (isComputingLayout()) {
            d0Var.mPendingAccessibilityState = i10;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        androidx.core.view.z.A0(d0Var.itemView, i10);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        h0.g.f(lVar);
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.k();
            this.mItemAnimator.v(null);
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.v(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.mRecycler.G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.k();
            }
            this.mLayout.s1(this.mRecycler);
            this.mLayout.t1(this.mRecycler);
            this.mRecycler.c();
            if (this.mIsAttached) {
                this.mLayout.K(this, this.mRecycler);
            }
            this.mLayout.M1(null);
            this.mLayout = null;
        } else {
            this.mRecycler.c();
        }
        this.mChildHelper.o();
        this.mLayout = pVar;
        if (pVar != null) {
            if (pVar.f3567b == null) {
                pVar.M1(this);
                if (this.mIsAttached) {
                    this.mLayout.J(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f3567b.exceptionLabel());
            }
        }
        this.mRecycler.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View, androidx.core.view.m
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().n(z10);
    }

    public void setOnFlingListener(s sVar) {
        this.mOnFlingListener = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.mScrollListener = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(v vVar) {
        this.mRecycler.E(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.mRecyclerListener = xVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.mScrollState) {
            return;
        }
        this.mScrollState = i10;
        if (i10 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.mRecycler.F(b0Var);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (isComputingLayout()) {
            int a10 = accessibilityEvent != null ? i0.b.a(accessibilityEvent) : 0;
            this.mEatenAccessibilityChangeFlags |= a10 != 0 ? a10 : 0;
            return true;
        }
        return false;
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, null);
    }

    public void smoothScrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.Q1(this, this.mState, i10);
        }
    }

    void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().p(i10);
    }

    void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, androidx.core.view.m
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(h hVar, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int j10 = this.mChildHelper.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < j10; i14++) {
            View i15 = this.mChildHelper.i(i14);
            d0 childViewHolderInt = getChildViewHolderInt(i15);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i10 && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((q) i15.getLayoutParams()).f3592c = true;
            }
        }
        this.mRecycler.M(i10, i11);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w0.a.f38146a);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().g(i10, i11, i12, i13, iArr, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.d0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.mChildHelper
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.mChildHelper
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().l(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, UNDEFINED_DURATION);
    }

    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().q(i10, i11);
    }

    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().s(i10);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        Parcelable f3523c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3523c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void e(SavedState savedState) {
            this.f3523c = savedState.f3523c;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f3523c, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new androidx.recyclerview.widget.q();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new l();
        this.mItemAnimator = new androidx.recyclerview.widget.c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z10 = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new e.b() : null;
        this.mState = new a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = androidx.core.view.b0.b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = androidx.core.view.b0.d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.v(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (androidx.core.view.z.A(this) == 0) {
            androidx.core.view.z.A0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.l(this));
        int[] iArr = w0.c.f38150a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        androidx.core.view.z.o0(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(w0.c.f38159j);
        if (obtainStyledAttributes.getInt(w0.c.f38153d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(w0.c.f38152c, true);
        boolean z11 = obtainStyledAttributes.getBoolean(w0.c.f38154e, false);
        this.mEnableFastScroller = z11;
        if (z11) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(w0.c.f38157h), obtainStyledAttributes.getDrawable(w0.c.f38158i), (StateListDrawable) obtainStyledAttributes.getDrawable(w0.c.f38155f), obtainStyledAttributes.getDrawable(w0.c.f38156g));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i10, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
            androidx.core.view.z.o0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
            z10 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z10);
    }

    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12) {
        smoothScrollBy(i10, i11, interpolator, i12, false);
    }

    /* loaded from: classes.dex */
    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        d0 f3590a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f3591b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3592c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3593d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3591b = new Rect();
            this.f3592c = true;
            this.f3593d = false;
        }

        public int c() {
            return this.f3590a.getLayoutPosition();
        }

        public boolean e() {
            return this.f3590a.isUpdated();
        }

        public boolean f() {
            return this.f3590a.isRemoved();
        }

        public boolean g() {
            return this.f3590a.isInvalid();
        }

        public q(int i10, int i11) {
            super(i10, i11);
            this.f3591b = new Rect();
            this.f3592c = true;
            this.f3593d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3591b = new Rect();
            this.f3592c = true;
            this.f3593d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3591b = new Rect();
            this.f3592c = true;
            this.f3593d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f3591b = new Rect();
            this.f3592c = true;
            this.f3593d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.P(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            if (!pVar.u()) {
                i10 = 0;
            }
            if (!this.mLayout.v()) {
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return;
            }
            if (i12 == Integer.MIN_VALUE || i12 > 0) {
                if (z10) {
                    int i13 = i10 != 0 ? 1 : 0;
                    if (i11 != 0) {
                        i13 |= 2;
                    }
                    startNestedScroll(i13, 1);
                }
                this.mViewFlinger.e(i10, i11, i12, interpolator);
                return;
            }
            scrollBy(i10, i11);
        }
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }
}
