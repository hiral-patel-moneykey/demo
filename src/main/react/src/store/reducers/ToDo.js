import * as actionTypes from '../actions/actionTypes';

const initialState = {
    tasks : []
}

const addTaskSuccess = ( state, action ) => {

    const newTask = [action.taskDesc];
    return { tasks : state.tasks.concat(newTask) };

}

const addTaskFail = ( state, action ) => {

    return state;

}

const reducer = ( state = initialState, action ) => {

    switch (action.type) {
        case actionTypes.ADD_TASK_SUCCESS : return addTaskSuccess(state, action);
        case actionTypes.ADD_TASK_FAIL : return addTaskFail(state, action);
        default: return state;
    }

}

export default reducer;