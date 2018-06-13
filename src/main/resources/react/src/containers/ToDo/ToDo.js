import React, { Component } from 'react';
import { connect } from 'react-redux';
import * as actions from '../../store/actions/index';

import ToDoList from "../../components/ToDo/ToDoList";

export class ToDo extends Component {

    constructor(props) {

        super(props);
        this.state = {
            taskDesc : "",
        }

        //this.handleChange = this.handleChange.bind(this);
        //this.handleAddTask = this.handleAddTask.bind(this);

    }

    handleChange(event) {
        this.setState({taskDesc : event.target.value});
    }

    handleAddTask(event) {
        this.props.onTaskAdded(this.state.taskDesc);
    }

    render() {

        return (

            <div>
                <input type="text" id="newTask" name="newTask" value={this.state.taskDesc} onChange={this.handleChange.bind(this)} />
                <br />
                <button onClick={this.handleAddTask.bind(this)}>Add Task</button>
                <br />
                <ToDoList tasks={this.props.tasks}/>
            </div>

        );

    }

}

const mapStateToProps = state => {
    return {
        tasks: state.todo.tasks,
    }
}

const mapDispatchToProps = dispatch => {
    return {
        onTaskAdded: (task) => dispatch(actions.addTask(task))
    }
}

export default connect(mapStateToProps, mapDispatchToProps)(ToDo);