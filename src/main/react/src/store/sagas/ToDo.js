// import { delay } from 'redux-saga'
import { put } from "redux-saga/effects";

import axiosweb from "../../axios/axiosweb";
import * as actions from "../actions";

export function* addTaskSaga(action) {

    try {

        console.log("Sending request with "+ action.taskDesc)

        const response = yield axiosweb.post(
            "/tasks",
            action.taskDesc
        );
        yield put (actions.addTaskSuccess(response.data, action.taskDesc));

        //yield call(delay, 1000)
        //yield put({ type: 'INCREMENT' })
    }
    catch (error) {
        yield put(actions.addTaskFail(error))
    }

}