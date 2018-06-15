import * as actionTypes from "./actionTypes";

export const addTask = ( task ) => {

    return {
        type: actionTypes.ADD_TASK,
        taskDesc: task
    };

};

export const addTaskSuccess = ( responsedata, task ) => {

    return {
        type: actionTypes.ADD_TASK_SUCCESS,
        responsedata: responsedata,
        taskDesc: task
    }

};

export const addTaskFail = (error) => {
    return {
        type: actionTypes.ADD_TASK_FAIL,
        error: error
    }
};