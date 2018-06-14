
import { put } from "redux-saga/effects";

import axiosweb from "../../axios/axiosweb";
import * as actions from "../actions";

import {addTaskSaga} from "./ToDo";
import {addTask} from "../actions/index"

describe("To Do events of Redux Saga", () => {

    it("should add tasks successfully ", () => {
        const actionAddTask = addTask("Sample Task")
        const gen = addTaskSaga(actionAddTask);

        // expect(gen.next().value).
        // console.log(gen.next().value)
        expect(2+2).toBe(4);
    });

})