import { takeEvery, all } from "redux-saga/effects";

import * as actionTypes from "../actions/actionTypes";

import { addTaskSaga } from "./ToDo";

export function* watchTasks() {
    yield all([
        takeEvery(actionTypes.ADD_TASK, addTaskSaga)
    ])
}