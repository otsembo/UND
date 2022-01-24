package com.example.android.eggtimernotifications.databinding;
import com.example.android.eggtimernotifications.R;
import com.example.android.eggtimernotifications.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEggTimerBindingImpl extends FragmentEggTimerBinding implements com.example.android.eggtimernotifications.generated.callback.OnItemSelected.Listener, com.example.android.eggtimernotifications.generated.callback.OnCheckedChangeListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.egg_image, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected mCallback1;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEggTimerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentEggTimerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[4]
            , (android.widget.Spinner) bindings[2]
            , (android.widget.Switch) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.minutesSpinner.setTag(null);
        this.onOffSwitch.setTag(null);
        this.textView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.android.eggtimernotifications.generated.callback.OnItemSelected(this, 1);
        mCallback2 = new com.example.android.eggtimernotifications.generated.callback.OnCheckedChangeListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.eggTimerViewModel == variableId) {
            setEggTimerViewModel((com.example.android.eggtimernotifications.ui.EggTimerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEggTimerViewModel(@Nullable com.example.android.eggtimernotifications.ui.EggTimerViewModel EggTimerViewModel) {
        this.mEggTimerViewModel = EggTimerViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.eggTimerViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEggTimerViewModelElapsedTime((androidx.lifecycle.LiveData<java.lang.Long>) object, fieldId);
            case 1 :
                return onChangeEggTimerViewModelTimeSelection((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeEggTimerViewModelIsAlarmOn((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEggTimerViewModelElapsedTime(androidx.lifecycle.LiveData<java.lang.Long> EggTimerViewModelElapsedTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEggTimerViewModelTimeSelection(androidx.lifecycle.LiveData<java.lang.Integer> EggTimerViewModelTimeSelection, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeEggTimerViewModelIsAlarmOn(androidx.lifecycle.LiveData<java.lang.Boolean> EggTimerViewModelIsAlarmOn, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Long eggTimerViewModelElapsedTimeGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Long> eggTimerViewModelElapsedTime = null;
        androidx.lifecycle.LiveData<java.lang.Integer> eggTimerViewModelTimeSelection = null;
        int androidxDatabindingViewDataBindingSafeUnboxEggTimerViewModelTimeSelectionGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxEggTimerViewModelIsAlarmOnGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> eggTimerViewModelIsAlarmOn = null;
        java.lang.Integer eggTimerViewModelTimeSelectionGetValue = null;
        long androidxDatabindingViewDataBindingSafeUnboxEggTimerViewModelElapsedTimeGetValue = 0;
        com.example.android.eggtimernotifications.ui.EggTimerViewModel eggTimerViewModel = mEggTimerViewModel;
        java.lang.Boolean eggTimerViewModelIsAlarmOnGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (eggTimerViewModel != null) {
                        // read eggTimerViewModel.elapsedTime
                        eggTimerViewModelElapsedTime = eggTimerViewModel.getElapsedTime();
                    }
                    updateLiveDataRegistration(0, eggTimerViewModelElapsedTime);


                    if (eggTimerViewModelElapsedTime != null) {
                        // read eggTimerViewModel.elapsedTime.getValue()
                        eggTimerViewModelElapsedTimeGetValue = eggTimerViewModelElapsedTime.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(eggTimerViewModel.elapsedTime.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxEggTimerViewModelElapsedTimeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(eggTimerViewModelElapsedTimeGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (eggTimerViewModel != null) {
                        // read eggTimerViewModel.timeSelection
                        eggTimerViewModelTimeSelection = eggTimerViewModel.getTimeSelection();
                    }
                    updateLiveDataRegistration(1, eggTimerViewModelTimeSelection);


                    if (eggTimerViewModelTimeSelection != null) {
                        // read eggTimerViewModel.timeSelection.getValue()
                        eggTimerViewModelTimeSelectionGetValue = eggTimerViewModelTimeSelection.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(eggTimerViewModel.timeSelection.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxEggTimerViewModelTimeSelectionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(eggTimerViewModelTimeSelectionGetValue);
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (eggTimerViewModel != null) {
                        // read eggTimerViewModel.isAlarmOn
                        eggTimerViewModelIsAlarmOn = eggTimerViewModel.isAlarmOn();
                    }
                    updateLiveDataRegistration(2, eggTimerViewModelIsAlarmOn);


                    if (eggTimerViewModelIsAlarmOn != null) {
                        // read eggTimerViewModel.isAlarmOn.getValue()
                        eggTimerViewModelIsAlarmOnGetValue = eggTimerViewModelIsAlarmOn.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(eggTimerViewModel.isAlarmOn.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxEggTimerViewModelIsAlarmOnGetValue = androidx.databinding.ViewDataBinding.safeUnbox(eggTimerViewModelIsAlarmOnGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.minutesSpinner, androidxDatabindingViewDataBindingSafeUnboxEggTimerViewModelTimeSelectionGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.minutesSpinner, mCallback1, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.onOffSwitch, mCallback2, (androidx.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.onOffSwitch, androidxDatabindingViewDataBindingSafeUnboxEggTimerViewModelIsAlarmOnGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.example.android.eggtimernotifications.util.BindingUtilsKt.setElapsedTime(this.textView, androidxDatabindingViewDataBindingSafeUnboxEggTimerViewModelElapsedTimeGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnItemSelected(int sourceId , android.widget.AdapterView callbackArg_0, android.view.View callbackArg_1, int callbackArg_2, long callbackArg_3) {
        // localize variables for thread safety
        // eggTimerViewModel != null
        boolean eggTimerViewModelJavaLangObjectNull = false;
        // eggTimerViewModel
        com.example.android.eggtimernotifications.ui.EggTimerViewModel eggTimerViewModel = mEggTimerViewModel;



        eggTimerViewModelJavaLangObjectNull = (eggTimerViewModel) != (null);
        if (eggTimerViewModelJavaLangObjectNull) {



            eggTimerViewModel.setTimeSelected(callbackArg_2);
        }
    }
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // eggTimerViewModel != null
        boolean eggTimerViewModelJavaLangObjectNull = false;
        // eggTimerViewModel
        com.example.android.eggtimernotifications.ui.EggTimerViewModel eggTimerViewModel = mEggTimerViewModel;



        eggTimerViewModelJavaLangObjectNull = (eggTimerViewModel) != (null);
        if (eggTimerViewModelJavaLangObjectNull) {



            eggTimerViewModel.setAlarm(callbackArg_1);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eggTimerViewModel.elapsedTime
        flag 1 (0x2L): eggTimerViewModel.timeSelection
        flag 2 (0x3L): eggTimerViewModel.isAlarmOn
        flag 3 (0x4L): eggTimerViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}