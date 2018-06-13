import React from 'react';

import { ToDo } from "./ToDo";
import ToDoList from "../../components/ToDo/ToDoList";
import { configure, shallow } from 'enzyme';
import Adapter from 'enzyme-adapter-react-16';

configure({adapter: new Adapter()});

describe('<ToDo />', () => {

    it("Should have Add Task button", () => {
       let wrapper = shallow(<ToDo />);
       wrapper.setProps({tasks: [], onTaskAdded: () => { console.log("Testing");} });
       expect(wrapper.contains(<ToDoList tasks={this.props.tasks}/>)).toBe(true);
       expect(wrapper.find("button")).toHaveLength(1);
       console.log("Wrapper is "+ wrapper.toString());
    });
});